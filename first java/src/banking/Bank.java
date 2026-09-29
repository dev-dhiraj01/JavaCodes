package banking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<BankAccount> accounts;
    private final File file;

    public Bank() {
        this.file = new File("C:\\Users\\Dhiraj\\IdeaProjects\\first java\\src\\BankHis2.txt");
        accounts = readAccountsFromFile();
    }


    public void createAccount(int accountNumber, String accountHolderName, double balance) {
        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
        accounts.add(account);
        writeAccountsToFile();
    }

    public synchronized BankAccount getAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void deposit(int accountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            writeAccountsToFile();
        }
    }

    public void withdraw(int accountNumber, double amount) {
        BankAccount account = getAccount(accountNumber);
        if (account != null) {
            try {
                account.withdraw(amount);
                writeAccountsToFile();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        BankAccount fromAccount = getAccount(fromAccountNumber);
        BankAccount toAccount = getAccount(toAccountNumber);
        if (fromAccount != null && toAccount != null) {
            BankAccount firstAccount;
            BankAccount secondAccount;
            if (fromAccountNumber < toAccountNumber) {
                firstAccount = fromAccount;
                secondAccount = toAccount;
            } else {
                firstAccount = toAccount;
                secondAccount = fromAccount;
            }
            synchronized (firstAccount) {
                synchronized (secondAccount) {
                    try {
                        fromAccount.withdraw(amount);
                        toAccount.deposit(amount);
                        writeAccountsToFile();
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }


    private List<BankAccount> readAccountsFromFile() {
        List<BankAccount> accounts = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int accountNumber = Integer.parseInt(parts[0]);
                String accountHolderName = parts[1];
                double balance = Double.parseDouble(parts[2]);
                BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);
                accounts.add(account);
            }
        } catch (IOException e) {
            System.out.println("Error reading accounts from file: " + e.getMessage());
        }
        return accounts;
    }

    private void writeAccountsToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (BankAccount account : accounts) {
                String line = account.getAccountNumber() + "," + account.getAccountHolderName() + "," + account.getBalance();
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing accounts to file: " + e.getMessage());
        }
    }
}

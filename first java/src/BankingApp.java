import java.util.Scanner;
import banking.Bank;
import banking.BankAccount;

public class BankingApp
{
    public static void main(String[] args)
    {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        // Create new accounts
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Enter account holder name:");
        String accountHolderName = scanner.nextLine();
        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();
        bank.createAccount(accountNumber, accountHolderName, balance);

        scanner.nextLine(); // consume newline
        System.out.println("Enter amount to deposit:");
        double amount = scanner.nextDouble();
        bank.deposit(accountNumber, amount);

        System.out.println("Enter amount to withdraw:");
        amount = scanner.nextDouble();
        bank.withdraw(accountNumber, amount);

        System.out.println("Enter account number to transfer from:");
        int fromAccountNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Enter account number to transfer to:");
        int toAccountNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline
        System.out.println("Enter amount to transfer:");
        amount = scanner.nextDouble();
        bank.transfer(fromAccountNumber, toAccountNumber, amount);



        System.out.println("Enter account number to print details:");
        accountNumber = scanner.nextInt();
        scanner.nextLine(); // consume newline
        BankAccount account = bank.getAccount(accountNumber);
        if (account != null)
        {
            System.out.println("Account " + account.getAccountNumber() + ": " + account.getAccountHolderName() + ", " + account.getBalance());
        }
        else
        {
            System.out.println("Account not found");
        }
    }
}

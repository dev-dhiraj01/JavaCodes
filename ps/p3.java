import java.util.Scanner;

// BankAccount class demonstrating Encapsulation
class BankAccount {
    // Private data members (encapsulated)
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Public method to check balance
    public double getBalance() {
        return balance;
    }

    // Public method to display account details
    public void displayAccountInfo() {
        System.out.println("\nAccount Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a bank account (hardcoded details for demo)
        BankAccount account = new BankAccount("John Doe", "1234567890", 10000.0);

        int choice;
        do {
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Information");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double depAmount = sc.nextDouble();
                    account.deposit(depAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withAmount = sc.nextDouble();
                    account.withdraw(withAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: ₹" + account.getBalance());
                    break;
                case 4:
                    account.displayAccountInfo();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}

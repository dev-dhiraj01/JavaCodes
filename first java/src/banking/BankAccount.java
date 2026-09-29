package banking;

public class BankAccount
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // getters and setters
    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber= accountNumber;
    }
    public  String getAccountHolderName()
    {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName)
    {
        this.accountHolderName=accountHolderName;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    // methods
    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
        } else
        {
            throw new IllegalArgumentException("Insufficient balance");
        }
    }


}

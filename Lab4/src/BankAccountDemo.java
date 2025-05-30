import java.util.Scanner;
/**
 * Bank account of customers with account balance
 * and operations on the account
 */

class BankAccount
{
    //Data fields

    //balance field with the current value of account balance
    private double balance;

    //Methods

    // :: Constructors
    public BankAccount()
    {
        balance = 0.0;
    }

    public BankAccount(double startBalance)
    {
        balance = startBalance;
    }

    public BankAccount(String str)
    {
        balance = Double.parseDouble(str);
    }

    // Other Methods

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void deposit(String str)
    {
        balance += Double.parseDouble(str);
    }

    public void withdraw (double amount)
    {
        balance -= amount;
    }

    public void withdraw (String str)
    {
        balance -= Double.parseDouble(str);
    }

    // Mutators (Setters)

    public void setBalance(double b)
    {
        balance = b;
    }

    public void setBalance(String str)
    {
        balance = Double.parseDouble(str);
    }

    // Accessors (Getters)
    public double getBalance()
    {
        return balance;
    }
}

public class BankAccountDemo
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        BankAccount myAccount = new BankAccount();

        System.out.println("Your account is created!");
        System.out.println("Your balance is : " + myAccount.getBalance());

        System.out.println("How much do you want to deposit? ");
        double amount = in.nextDouble();
        myAccount.deposit(amount);
        System.out.println("Your new balance is : " + myAccount.getBalance());


        System.out.println("How much do you want to withdraw? ");
        amount = in.nextDouble();

        if (amount <= myAccount.getBalance())
        {
            myAccount.withdraw(amount);
            System.out.println("Withdrawal successful!");
        }
        else
        {
            System.out.println("Withdrawal not successful! Insufficient funds.");
        }

        System.out.println("Your current balance is " + myAccount.getBalance());
    }
}

import java.util.Scanner;
public class SavingsAccountDemo
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What is your annual interest rate: ");
        double annualInterestRate = keyboard.nextDouble();
        System.out.print("What was your starting balance: ");
        double startBalance = keyboard.nextDouble();
        System.out.print("How many months have you had your account for: ");
        int months = keyboard.nextInt();
        double interestEarned = 0.0;
        SavingsAccount savingsAccount = new SavingsAccount(startBalance);
        savingsAccount.setAnnualInterest(annualInterestRate);
        int depositCount = 0;
        int withdrawCount = 0;
        for (int i = 1; i <= months; i++)
        {
            System.out.printf("How much did you deposit in your account during month %d? ", i);
            double depAm = keyboard.nextDouble();
            savingsAccount.setDepositAmount(depAm);
            savingsAccount.deposit();
            if (depAm > 0)
            {
                depositCount += depAm;
            }
            System.out.printf("How much did you withdraw from your account during month %d? ", i);
            double withAm = keyboard.nextDouble();
            savingsAccount.setWithdrawAmount(withAm);
            savingsAccount.withdraw();
            if (withAm > 0)
            {
                withdrawCount+= withAm;
            }
            interestEarned += savingsAccount.calculateMonthlyInterestAmount();
        }
        System.out.printf("Your ending balance is: $%.2f." +
                "Your total amount of deposists is: $%d. " +
                "Your total amount of withdrawals is: $%d. " +
                "Your total interest earned is: $%.2f. ", savingsAccount.getBalance(), +
                depositCount, withdrawCount, interestEarned);
    }
}

class SavingsAccount
{
    //fields
    private double annualInterest;
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    private double monthlyInterest;
    private double monthlyInterestAmount;

    //constructor
    public SavingsAccount(double startingBalance)
    {
        balance = startingBalance;
    }

    //getters
    public double getBalance()
    {
        return balance;
    }
    public double getInterest()
    {
        return monthlyInterest;
    }

    //setters
    public void setAnnualInterest(double annInterest)
    {
        annualInterest = annInterest;
    }
    public void setDepositAmount(double depAmount)
    {
        depositAmount = depAmount;
    }
    public void setWithdrawAmount(double witAmount)
    {
        withdrawAmount = witAmount;
    }

    //methods
    public void withdraw()
    {
        balance -= withdrawAmount;
    }
    public void deposit()
    {
        balance += depositAmount;
    }
    public double calculateMonthlyInterestAmount()
    {
        monthlyInterest = (annualInterest / 100) / 12;
        monthlyInterestAmount = balance * monthlyInterest;
        balance += monthlyInterestAmount;
        return monthlyInterestAmount;
    }
}

import java.util.Scanner;

public class PayrollDemo
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        Payroll payroll = new Payroll("Kristina Cecura", 2495184);
        System.out.print("Please enter your hourly pay rate: ");
        double hourlyPayRate = keyboard.nextDouble();
        payroll.setPayRate(hourlyPayRate);
        System.out.print("Please enter the number of hours worked: ");
        double employeeHoursWorked = keyboard.nextDouble();
        payroll.setHoursWorked(employeeHoursWorked);
        System.out.printf("Hello, %s(%d). ", payroll.getName(), payroll.getIdNumber());
        System.out.printf("Your gross pay is: $%.2f", payroll.returnPay());
    }
}

class Payroll
{
    //fields
    private String name;
    private int idNumber;
    private double payRate;
    private double hoursWorked;

    //constructor
    public Payroll(String employeeName, int employeeIdNumber)
    {
        name = employeeName;
        idNumber = employeeIdNumber;
    }

    //accessors
    public String getName()
    {
        return name;
    }
    public int getIdNumber()
    {
        return idNumber;
    }
    public double getPayRate()
    {
        return payRate;
    }
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    //mutators
    public void setName(String employeeName)
    {
        name = employeeName;
    }
    public void setIdNumber(int employeeIdNumber)
    {
        idNumber = employeeIdNumber;
    }
    public void setPayRate(double employeePayRate)
    {
        payRate = employeePayRate;
    }
    public void setHoursWorked(double employeeHoursWorked)
    {
        hoursWorked = employeeHoursWorked;
    }
    //methods
    public double returnPay()
    {
        return hoursWorked * payRate;
    }
}
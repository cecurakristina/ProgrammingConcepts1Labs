import java.util.Scanner; //Needed for Scanner class

/*
*Calculate the gross pay
 */

public class Payroll
{
    public static void main(String[] args)
    {
        String name;        //To hold a name
        int hours;          //Hours worked
        double payRate;     //Hourly pay rate
        double grossPay;    //Gross pay

        //Create a Scanner object to read input
        Scanner userInput;
        userInput = new Scanner(System.in);

        //Get the user name
        System.out.print("What is your name? ");
        name = userInput.nextLine();

        //Get the hours worked
        System.out.print("How many hours did you work? ");
        hours = userInput.nextInt();

        //Get pay rate
        System.out.print("How much do you get paid per hour? ");
        payRate = userInput.nextDouble();

        //Print the gross pay
        System.out.print("Hello " + name + ". Your gross pay is $" +
                hours * payRate);
    }
}

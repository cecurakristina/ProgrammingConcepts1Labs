/*This program calculates a customer’s monthly bill. It asks the user to enter the letter of the package purchased (A, B, or C) and the number of hours that were used. It then displays the total charges.*/
import java.util.Scanner;
public class InternetServiceProvider
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        double monthlyBill = 0;
        System.out.print("Please enter \"A\", \"B\" or \"C\" to indicate your subscription package: ");
        String subscrptionPackage = userInput.nextLine();
        System.out.print("Please enter the number of hours you used the service for: ");
        double hoursUsed = userInput.nextDouble();
        if (subscrptionPackage.equalsIgnoreCase("A"))
        {
            if (hoursUsed <= 10)
            {
                monthlyBill = 9.95;
            }
            else
            {
            monthlyBill = 9.95 + ((hoursUsed - 10) * 2);
            }
        }
        if (subscrptionPackage.equalsIgnoreCase("B"))
        {
            if (hoursUsed <= 20)
            {
                monthlyBill = 13.95;
            }
            else
            {
                monthlyBill = 13.95 + (hoursUsed - 20);
            }
        }
    if (subscrptionPackage.equalsIgnoreCase("C"))
        {
            monthlyBill = 19.95;
        }

        System.out.print("Your monthly bill is: $" + monthlyBill);
    }
}

/*This program asks the user to enter the weight of a package and then displays the shipping charges.*/
import java.util.Scanner;
public class ShippingCharges
{
    public static void main (String[] args)
    {
        System.out.print("Please enter the weight of your package in pounds: ");

        Scanner userInput = new Scanner(System.in);
        int packageWeight = userInput.nextInt();
        double shippingCharges = 0;

        if (packageWeight <= 2 && packageWeight > 0)
        {
            shippingCharges = 1.10;
        }
        else if (packageWeight > 2 && packageWeight <= 6)
        {
            shippingCharges = 2.20;
        }
        else if (packageWeight > 6 && packageWeight <= 10)
        {
            shippingCharges = 3.70;
        }
        else if (packageWeight > 10)
        {
            shippingCharges = 3.80;
        }

        System.out.print("Your shipping charges per 500 miles shipped are: $" + shippingCharges);
    }
}

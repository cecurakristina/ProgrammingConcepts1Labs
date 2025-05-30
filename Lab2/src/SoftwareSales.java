/* This program displays the amount of the discount (if any) and the total amount of the
purchase after the discount. */

import java.util.Scanner;

public class SoftwareSales
{
    public static void main(String args[])
    {
        System.out.print("Please enter the number of packages purchased: ");
        Scanner userInput = new Scanner(System.in);
        int numberPackages = userInput.nextInt();
        double packagePrice = 99;
        double discount = 0;

        if (numberPackages < 10)
        {
            discount = 0;
        }
        else if (numberPackages >= 10 && numberPackages < 20)
        {
            discount = numberPackages * (packagePrice * 0.2);
        }
        else if (numberPackages >= 20 && numberPackages < 50)
        {
            discount = numberPackages * (packagePrice * 0.3);
        }
        else if (numberPackages >= 50 && numberPackages < 100)
        {
            discount = numberPackages * (packagePrice * 0.4);
        }
        else if (numberPackages >= 100)
        {
            discount = numberPackages * (packagePrice * 0.5);
        }

        double finalPrice = numberPackages * packagePrice - discount;

        System.out.println("Your discount is: $" + discount);
        System.out.println("Your final price is: $" + finalPrice);
    }
}

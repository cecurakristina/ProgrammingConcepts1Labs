//This program computes state and county sales tax and adds it to the purchase amount.
import java.util.Scanner;

public class SalesTax
{
    public static void main(String[] args)
    {
        double purchaseAmount;
        System.out.print("What is the amount of your purchase? ");
        Scanner userInput = new Scanner(System.in);
        purchaseAmount = userInput.nextDouble();

        double stateTax = 0.04 * purchaseAmount;
        double countyTax = 0.02 * purchaseAmount;
        double totalSalesTax = stateTax + countyTax;
        double totalSale = purchaseAmount + totalSalesTax;

        System.out.print("Amount of the purchase: $" + purchaseAmount +
                "\nState sales tax: $" + stateTax +
                "\nCounty sales tax: $" + countyTax +
                "\nTotal sales tax: $" + totalSalesTax +
                "\nTotal of the sale: $" + totalSale);
    }
}

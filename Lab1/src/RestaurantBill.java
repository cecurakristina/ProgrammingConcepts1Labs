//This program computes the tax and tip on a restaurant bill.
import java.util.Scanner;

public class RestaurantBill
{
    public static void main(String[] args)
    {
        System.out.print("How much did your meal cost? ");  //ask for the price of the meal
        Scanner userInput = new Scanner(System.in);

        double mealCharge = userInput.nextDouble();         //meal price
        double taxAmount = mealCharge * 0.0675;             //tax amount
        double totalCharge = mealCharge + taxAmount;        //meal price including tax
        double tipAmount = totalCharge * 0.2;               //20% of the total price to tip
        double totalBill = totalCharge + tipAmount;         //final bill including tax and tip

        System.out.print("Meal charge: $" + mealCharge +
                "\nTax Amount: $" + taxAmount +
                "\nTip amount: $" + tipAmount +
                "\nTotal Bill: $" + totalBill);
    }
}

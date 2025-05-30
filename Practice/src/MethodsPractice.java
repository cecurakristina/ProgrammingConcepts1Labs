import javax.swing.*;

public class MethodsPractice
{
    public static void main (String[] args)
    {
        String response = JOptionPane.showInputDialog("Please enter a number: ");
        int number = Integer.parseInt(response);
        double result = square(number);
        System.out.printf("%.2f", result);
        //getName();
        //String input = JOptionPane.showInputDialog("Enter a number: ");
        //int quarter = Integer.parseInt(input);
        //double dollarValue = quartersToDollars(quarter);
        //System.out.printf("%d quarters is equal to $%.2f.", quarter, dollarValue);
    }
    public static int square (int number)
    {
        return number * number;
    }
    public static String getName ()
    {
        String name = JOptionPane.showInputDialog("Please enter your name: ");
        System.out.printf("Your name is %s.", name);
        return name;
    }
    public static double quartersToDollars(int quarter)
    {
        return quarter * 0.25;
    }
}

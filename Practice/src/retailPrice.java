import javax.swing.*;

public class retailPrice
{
    public static void main (String args[])
    {
        System.out.printf("Your retail price is $%.2f.", calculateRetail());
    }
    public static double calculateRetail()
    {
        double wholesaleCost;
        double markupPercentage;
        String inputWholesale = JOptionPane.showInputDialog("Enter a wholesale cost: ");
        wholesaleCost = Double.parseDouble(inputWholesale);
        String inputMarkup = JOptionPane.showInputDialog("Enter a markup percentage: ");
        markupPercentage = Double.parseDouble(inputMarkup);
        return wholesaleCost + ((wholesaleCost * markupPercentage) / 100);
    }
}

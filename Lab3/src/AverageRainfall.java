import java.util.Scanner;
public class AverageRainfall
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int years;
        int month = 0;
        double rainfall = 0;
        double totalRainfall = 0;
        double averageRainfall = 0;

        //Ask user to enter the number of years and keep prompting for an input if the number is smaller than 1:
        do
        {
            System.out.print("Please enter the number of years: ");
            years = keyboard.nextInt();
        }
        while (years < 1);

        //Iterate over every month of the year and ask user to input the inches of rainfall for that month:
        for (int i = 1; i <= years; i++)
        {
            System.out.printf("YEAR %d%n", i);
            for (int j = 1; j <= 12; j++)
            {
                System.out.printf("Please enter the inches of the rainfall for month %d: ", j);
                rainfall = keyboard.nextDouble();
                totalRainfall += rainfall;
            }
        }
        month = years * 12;
        averageRainfall = totalRainfall / month;

        //Print out the number of months, total rainfall and average rainfall per month for the entire period:
        System.out.printf("The number of months: %d.%n", month);
        System.out.printf("Total inches of rainfall: %.2f inches.%n", totalRainfall);
        System.out.printf("Average rainfall per month: %.2f inches.", averageRainfall);
    }
}

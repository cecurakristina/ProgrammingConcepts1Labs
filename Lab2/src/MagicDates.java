/*This program determines if the date is "magic" (the month times the day is equal to the year*/

import java.util.Scanner;

public class MagicDates
{
    public static void main(String args[])
    {
        System.out.print("Please enter a month in the numeric form: ");
        Scanner userInput = new Scanner(System.in);
        int month = userInput.nextInt();
        System.out.print("Please enter a day in the numeric form: ");
        int day = userInput.nextInt();
        System.out.print("Please enter a year in the two-digit numeric form: ");
        int year = userInput.nextInt();

        if (month * day == year)
        {
            System.out.print("This date is magic!");
        }
        else
        {
            System.out.print("This date is not magic.");
        }

    }
}

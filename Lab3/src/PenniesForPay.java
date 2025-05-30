import java.util.Scanner;

public class PenniesForPay
{
    public static void main (String[] args)
    {
        int daysWorked = 0;
        double penniesEarned = 0.1, totalPay = 0;

        Scanner userInput = new Scanner(System.in);
        do
        {
            System.out.print("Enter the number of days worked: ");
            daysWorked = userInput.nextInt();
        }
        while (daysWorked < 1);

        System.out.println("DAY | PAY");
        System.out.println("-------------");


        for (int currentDay = 1; currentDay <= daysWorked; currentDay++)
        {
            if (currentDay != 1)
            {
                penniesEarned *= 2;
            }
            totalPay += penniesEarned;
            System.out.printf("%d   | $%.2f%n", currentDay, penniesEarned);
        }

        System.out.println("-------------");
        System.out.printf("TOTAL PAY: $%.2f", totalPay);

    }
}

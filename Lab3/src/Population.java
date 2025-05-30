import java.util.Scanner;
public class Population
{
    public static void main(String[] args)
    {
        double dailyIncrease, populationSize;
        int days;
        Scanner keyboard = new Scanner(System.in);
        //Keep prompting the user to enter the starting number of organisms as long as their input is smaller than 2:
        do
        {
            System.out.print("Please enter the starting number of organisms (2 or more): ");
            populationSize = keyboard.nextInt();
        }
        while (populationSize < 2);

        //Keep prompting the user to enter the percentage of the average daily increase as long as their input is a negative number:
        do
        {
            System.out.print("Please enter the percentage of the average daily increase: ");
            dailyIncrease = keyboard.nextDouble() / 100;
        }
        while (dailyIncrease < 0);

        //Keep prompting the use to enter the number of days organisms will multiply as long as the input is less than 1:
        do
        {
            System.out.print("Please enter the number of days (1 or more) that the organisms will multiply: ");
            days = keyboard.nextInt();
        }
        while(days < 1);

        //Display the size of the population for each day:
        for (int i = 1; i <= days; i++)
        {
            if (i == 1)
            {
                populationSize += 0;
            }
            else
            {
                populationSize += + (populationSize * dailyIncrease);
            }
            System.out.printf("Day %d - Size: %.2f%n", i, populationSize);
        }
    }
}

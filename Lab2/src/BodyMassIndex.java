//This program that calculates and displays a person’s body mass index (BMI).
import java.util.Scanner;

public class BodyMassIndex
{
    public static void main (String args[])
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your weight in pounds: ");
        int weight = userInput.nextInt();
        System.out.print("Please enter your height in inches: ");
        int height = userInput.nextInt();
        double BMI = weight * 703 / Math.pow(height, 2);

        if (BMI >= 18.5 && BMI <= 25)
        {
            System.out.print("You have optimal weight.");
        }
        else if (BMI < 18.5)
        {
            System.out.print("You are underweight.");
        }
        else if (BMI > 25)
        {
            System.out.print("You are overweight.");
        }
    }
}

import javax.swing.*;
import java.util.Scanner;

public class ConversionProgram
{
    public static void main(String args[])
    {
        //set up scanner;
        Scanner userInput = new Scanner(System.in);

        //initialize variables
        int choice = 0;
        double distance = 0;

        //ask user for distance and save it in a variable
        do
        {
            System.out.print("Enter a distance in meters: ");
            distance = userInput.nextDouble();
            userInput.nextLine();
        }
        while (distance < 0);


        //ask user to enter their choice
        do
        {
            //display the menu
            menu();
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = userInput.nextInt();
            userInput.nextLine();

            if (choice < 1 || choice > 4)
            {
                System.out.println("ERROR: Invalid input.");
                System.out.println();
            }

            if (choice == 1)
            {
                showKilometers(distance);
                System.out.println();
            }
            else if (choice == 2)
            {
                showInches(distance);
                System.out.println();
            }
            else if (choice == 3)
            {
                showFeet(distance);
                System.out.println();
            }
        }
        while (choice != 4);

        if (choice == 4)
        {
            System.out.println("Bye!");
        }
    }

    public static void menu ()
    {
        System.out.println("1.Convert to kilometers");
        System.out.println("2.Convert to inches");
        System.out.println("3.Convert to feet");
        System.out.println("4.Quit the program");
    }

    public static void showKilometers (double meters)
    {
        double kilometers = meters * 0.001;
        System.out.printf("%.0f meters is %.1f kilometers.%n", meters, kilometers);
    }
    public static void showInches (double meters)
    {
        double inches = meters * 39.37;
        System.out.printf("%.0f meters is %.1f inches.%n", meters, inches);
    }
    public static void showFeet (double meters)
    {
        double feet = meters * 3.281;
        System.out.printf("%.0f meters is %.1f feet.%n", meters, feet);
    }
}



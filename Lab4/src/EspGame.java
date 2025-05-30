import java.util.Random;
import java.util.Scanner;

public class EspGame
{
    public static void main (String args[])
    {
        int counter = 0;
        for (int i = 0; i < 10; i++)
        {
            String compChoice = randomColor();
            String userChoice = userGuess();
            System.out.printf("You chose: %s%n", userChoice);
            System.out.printf("Computer chose: %s%n", compChoice);
            System.out.println();
            if (userChoice.equalsIgnoreCase(compChoice))
            {
                counter++;
            }
        }
        System.out.printf("You guessed the color %d times.", counter);
    }

    public static String randomColor ()
    {
        String color = "";
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(5);

        switch (number)
        {
            case 0:
                color = "Red";
                break;
            case 1:
                color = "Green";
                break;
            case 2:
                color = "Blue";
                break;
            case 3:
                color = "Orange";
                break;
            case 4:
                color = "Yellow";
                break;
        }
        return color;
    }

    public static String userGuess()
    {
        String userSelection = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Red");
        System.out.println("Green");
        System.out.println("Blue");
        System.out.println("Orange");
        System.out.println("Yellow");
        System.out.print("Which color do you think the computer selected? Pick a color from the menu above: ");
        userSelection = keyboard.nextLine();
        System.out.println();
        return userSelection;
    }
}

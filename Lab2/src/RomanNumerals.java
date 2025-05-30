import java.util.Scanner;

public class RomanNumerals
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number between 1 and 10: ");

        Scanner keyboard = new Scanner(System.in);

        int userInput = keyboard.nextInt();

        if (userInput > 0 && userInput < 11)
        {
            if (userInput == 1)
            {
                System.out.println("The Roman numeral is: i");
            }
            else if (userInput == 2)
            {
                System.out.println("The Roman numeral is: ii");
            }
            else if (userInput == 3)
            {
                System.out.println("The Roman numeral is: iii");
            }
            else if (userInput == 4)
            {
                System.out.println("The Roman numeral is: iv");
            }
            else if (userInput == 5)
            {
                System.out.println("The Roman numeral is: v");
            }
            else if (userInput == 6)
            {
                System.out.println("The Roman numeral is: vi");
            }
            else if (userInput == 7)
            {
                System.out.println("The Roman numeral is: vii");
            }
            else if (userInput == 8)
            {
                System.out.println("The Roman numeral is: viii");
            }
            else if (userInput == 9)
            {
                System.out.println("The Roman numeral is: ix");
            }
            else if (userInput == 10)
            {
                System.out.println("The Roman numeral is: x");
            }
        }
        else
        {
            System.out.println("ERROR. Please enter a number between 1 and 10.");
        }
    }
}

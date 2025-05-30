import java.util.Random;
import java.util.Scanner;
public class SlotMachine
{
    public static void main(String[] args)
    {
        double money;
        int number;
        String result = "";
        String resultOne = "";
        String resultTwo = "";
        String resultThree = "";
        double moneyWon;
        String answer = "y";

        Random randomNumber = new Random();

        Scanner keyboard = new Scanner (System.in);

        while (answer.equals("Y") || answer.equals("y"))
        {
            System.out.print("How much money do you want to put in the slot machine? ");
            money = keyboard.nextDouble();

            for (int i = 0; i < 3; i++)
            {
                number = randomNumber.nextInt(5);
                if (number == 0)
                {
                    result = "Cherrries";
                    System.out.printf("%s%n", result);
                }
                else if (number == 1)
                {
                    result = "Oranges";
                    System.out.printf("%s%n", result);
                }
                else if (number == 2)
                {
                    result = "Plums";
                    System.out.printf("%s%n", result);
                }
                else if (number == 3)
                {
                    result = "Bells";
                    System.out.printf("%s%n", result);
                }
                else if (number == 4)
                {
                    result = "Melons";
                    System.out.printf("%s%n", result);
                }
                else if (number == 5)
                {
                    result = "Bars";
                    System.out.printf("%s%n", result);
                }

                if (i == 0)
                {
                    resultOne = result;
                }
                else if (i == 1)
                {
                    resultTwo = result;
                }
                else if (i == 2)
                {
                    resultThree = result;
                }
            }

            if (resultOne.equals(resultTwo) && resultTwo.equals(resultThree))
            {
                moneyWon = money * 3;
                System.out.printf("You won $%.2f.%n", moneyWon);
            }
            else if (resultOne.equals(resultTwo) || resultOne.equals(resultThree) || resultTwo.equals(resultThree))
            {
                moneyWon = money * 2;
                System.out.printf("You won $%.2f.%n", moneyWon);
            }
            else
            {
                System.out.print("You won $0.\n");
            }
            System.out.print("Do you want to play again? Press Y for yes or N for no: ");
            keyboard.nextLine();
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("N"))
            {
                System.out.print("Thanks for playing!");
            }
        }
    }
}

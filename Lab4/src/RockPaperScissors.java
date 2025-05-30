import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{

    public static void main (String args[])
    {
        String result = "";
        do
        {
            //generate a random number between 1 and 3
            String compChoice = computerChoice();
            String usrChoice = userChoice();
            System.out.printf("Computer chose %s. You chose %s.%n", compChoice, usrChoice);
            result = selectWinner(usrChoice, compChoice);
        }
        while (result.equalsIgnoreCase("tie"));

    }

    public static String computerChoice ()
    {
        String computerChoice = "";
        Random randomNumber = new Random();
        int number = randomNumber.nextInt(3) + 1;
        if (number == 1)
        {
            computerChoice = "rock";
        }
        else if (number == 2)
        {
            computerChoice = "paper";
        }
        else if (number == 3)
        {
            computerChoice = "scissors";
        }
        return computerChoice;
    }

    public static String userChoice ()
    {
        Scanner keyboard = new Scanner(System.in);
        String userInput = "";
        do
        {
            System.out.print("Enter rock, paper or scissors: ");
            userInput = keyboard.nextLine();
        }
        while (!userInput.equalsIgnoreCase("rock") && !userInput.equalsIgnoreCase("paper") && !userInput.equalsIgnoreCase("scissors"));

        return userInput;
    }

    public static String selectWinner (String userChoice, String computerChoice)
    {
        String result = "";

        if (computerChoice.equalsIgnoreCase(userChoice))
        {
            result = "tie";
        }
        else if (computerChoice.equalsIgnoreCase("rock"))
        {
            if (userChoice.equalsIgnoreCase("paper"))
            {
                result = "userWon";
            }
            else if (userChoice.equalsIgnoreCase("scissors"))
            {
                result = "compWon";
            }
        }
        else if (computerChoice.equalsIgnoreCase("paper"))
        {
            if (userChoice.equalsIgnoreCase("rock"))
            {
                result = "compWon";
            }
            else if (userChoice.equalsIgnoreCase("scissors"))
            {
                result = "compWon";
            }
        }
        else if (computerChoice.equalsIgnoreCase("scissors"))
        {
            if (userChoice.equalsIgnoreCase("rock"))
            {
                result = "userWon";
            }
            if (userChoice.equalsIgnoreCase("paper"))
            {
                result = "compWon";
            }
        }


        if (result.equalsIgnoreCase("userWon"))
        {
            System.out.print("You win!");
        }
        else if (result.equalsIgnoreCase("compWon"))
        {
            System.out.print("You lose.");
        }
        else if (result.equalsIgnoreCase("tie"))
        {
            System.out.printf("It's a tie, try again!%n");
        }
        return result;
    }
}

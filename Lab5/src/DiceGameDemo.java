import java.util.Random;
public class DiceGameDemo
{
    public static void main(String args[])
    {
        int computerDieSize = 6;
        int userDieSize = 6;
        int computerWins = 0;
        int userWins = 0;
        Die computerDie = new Die(computerDieSize);
        Die userDie = new Die(userDieSize);
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Rolling...");
            computerDie.roll();
            System.out.printf("Computer rolled: %d. ", computerDie.getValue());
            userDie.roll();
            System.out.printf("You rolled: %d.%n", userDie.getValue());
            if (computerDie.getValue() > userDie.getValue())
            {
                computerWins++;
            }
            else if (userDie.getValue() > computerDie.getValue())
            {
                userWins++;
            }
        }
        System.out.printf("You won %d times. Computer won %d times.", userWins, computerWins);
        if (computerWins > userWins)
        {
            System.out.print("Computer is the grand winner!");
        }
        else if (userWins > computerWins)
        {
            System.out.print("You are the grand winner!");
        }
        else
        {
            System.out.print("It's a tie!");
        }
    }
}


class Die
{
    //fields
    private int sides; // Number of sides
    private int value; // The die's value

    //constructor
    public Die(int numSides)
    {
        sides = numSides;
        roll();
    }

    //methods
    public void roll()
    {
        // Create a Random object.
        Random rand = new Random();
        // Get a random value for the die.
        value = rand.nextInt(sides) + 1;
    }
    public int getSides()
    {
        return sides;
    }
    public int getValue()
    {
        return value;
    }
}


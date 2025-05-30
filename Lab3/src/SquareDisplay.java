import java.util.Scanner;
public class SquareDisplay
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int userInput;

        do
        {
            System.out.print("Please enter a positive integer no greater than 15: ");
            userInput = keyboard.nextInt();
        }
        while (userInput < 0 || userInput > 15);

        for (int i = 0; i < userInput; i++)
        {
            for (int j = 0; j < userInput; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

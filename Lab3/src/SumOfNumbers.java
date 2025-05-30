import java.util.Scanner;
public class SumOfNumbers
{
    public static void main (String[] args)
    {
        int number, sum = 0;
        Scanner userInput = new Scanner(System.in);
        do
        {
            System.out.print("Enter a positive nonzero integer value: ");
            number = userInput.nextInt();
        }
        while (number <= 0);

        for (int i = 1; i <= number; i++)
        {
            sum += i;
        }
        System.out.printf("The sum of the numbers up to %d is %d.", number, sum);
        userInput.close();
    }
}

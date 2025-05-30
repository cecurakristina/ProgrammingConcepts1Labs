import java.util.Scanner;
public class LargestSmallest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a positive integer or -99 to stop: ");
        int integer = keyboard.nextInt();
        int biggestInt = integer;
        int smallestInt = integer;

        do
        {
            System.out.print("Enter another positive integer or -99 to stop: ");
            integer = keyboard.nextInt();
            if (integer == - 99)
            {
                break;
            }
            else
            {
                if (integer > biggestInt) {
                    biggestInt = integer;
                }
                if (integer < smallestInt) {
                    smallestInt = integer;
                }
            }
        }
        while (integer != -99) ;

        System.out.printf("biggest:  %d   and smallest: %d " , biggestInt, smallestInt);
    }
}
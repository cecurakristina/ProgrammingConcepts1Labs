import java.util.Scanner;

public class TestScores
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter score 1: ");
        int score1 = keyboard.nextInt();
        System.out.println("Please enter score 2: ");
        int score2 = keyboard.nextInt();
        System.out.println("Please enter score 3: ");
        int score3 = keyboard.nextInt();

        if (score1 < 60)
        {
            System.out.println("score1: F");
        }
        else if (score1 >= 60 && score1 < 70)
        {
            System.out.println("score1: D");
        }
        else if (score1 >= 70 && score1 < 80)
        {
            System.out.println("score1: C");
        }
        else if (score1 >= 80 && score1 < 90)
        {
            System.out.println("score1: B");
        }
        else if (score1 >= 90 && score1 <= 100)
        {
            System.out.println("score1: A");
        }
        else if (score1 < 0 || score1 > 100)
        {
            System.out.println("ERROR. Enter a score between 0 and 100.");
        }

        if (score2 < 60)
        {
            System.out.println("score2: F");
        }
        else if (score2 >= 60 && score2 < 70)
        {
            System.out.println("score2: D");
        }
        else if (score2 >= 70 && score2 < 80)
        {
            System.out.println("score2: C");
        }
        else if (score2 >= 80 && score2 < 90)
        {
            System.out.println("score2: B");
        }
        else if (score2 >= 90 && score2 <= 100)
        {
            System.out.println("score2: A");
        }
        else if (score2 < 0 || score2 > 100)
        {
            System.out.println("ERROR. Enter a score between 0 and 100.");
        }

        if (score3 < 60)
        {
            System.out.println("score3: F");
        }
        else if (score3 >= 60 && score3 < 70)
        {
            System.out.println("score3: D");
        }
        else if (score3 >= 70 && score3 < 80)
        {
            System.out.println("score3: C");
        }
        else if (score3 >= 80 && score3 < 90)
        {
            System.out.println("score3: B");
        }
        else if (score3 >= 90 && score3 <= 100)
        {
            System.out.println("score3: A");
        }
        else if (score3 < 0 || score3 > 100)
        {
            System.out.println("ERROR. Enter a score between 0 and 100.");
        }

    }
}

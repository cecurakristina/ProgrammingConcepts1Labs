import java.util.Scanner;

public class TestScoresDemo
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter score 1: ");
        int scoreOne = keyboard.nextInt();

        System.out.print("Please enter score 2: ");
        int scoreTwo = keyboard.nextInt();

        System.out.print("Please enter score 3: ");
        int scoreThree = keyboard.nextInt();

        TestScores testScores = new TestScores(scoreOne, scoreTwo, scoreThree);

        System.out.printf("Your average is: %d", testScores.getAverage());
    }
}

class TestScores
{
    private int score1;
    private int score2;
    private int score3;

    public TestScores(int s1, int s2, int s3)
    {
        score1 = s1;
        score2 = s2;
        score3 = s3;
    }

    public int getScoreOne()
    {
        return score1;
    }
    public int getScoreTwo()
    {
        return score2;
    }
    public int getScoreThree()
    {
        return score3;
    }

    public void setScoreOne(int one)
    {
        score1 = one;
    }
    public void setScoreTwo(int two)
    {
        score2 = two;
    }
    public void setScoreThree(int three)
    {
        score3 = three;
    }

    public int getAverage()
    {
        return (score1 + score2 + score3) / 3;
    }
}

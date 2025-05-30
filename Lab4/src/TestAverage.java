import javax.swing.*;

public class TestAverage
{
    public static void main (String args[])
    {
        double score1 = 0;
        double score2 = 0;
        double score3 = 0;
        double score4 = 0;
        double score5 = 0;

        for (int i = 1; i <= 5; i++)
        {
            String userInput = JOptionPane.showInputDialog("Please enter your score: ");
            double score = Double.parseDouble(userInput);
            switch (i)
            {
                case 1:
                    score1 = score;
                    break;
                case 2:
                    score2 = score;
                    break;
                case 3:
                    score3 = score;
                    break;
                case 4:
                    score4 = score;
                    break;
                case 5:
                    score5 = score;
                    break;
            }
        }

        determineGrade(score1);
        determineGrade(score2);
        determineGrade(score3);
        determineGrade(score4);
        determineGrade(score5);

        calcAverage(score1, score3, score3, score4, score5);
    }

    public static double calcAverage (double score1, double score2, double score3, double score4, double score5)
    {
        double average = ((score1 + score2 + score3 + score4 + score5) / 5);
        System.out.printf("Your average is: %.2f", average);
        return average;
    }

    public static String determineGrade (double score)
    {
        String grade = "";

        while(score < 0 || score  > 100)
        {
            String userInput = JOptionPane.showInputDialog("Please enter a valid score: ");
            score = Double.parseDouble(userInput);
        }


        if (score > 0 && score < 60)
        {
            grade = "F";
        }
        else if (score < 70 && score >= 60)
        {
            grade = "D";
        }
        else if (score < 80 && score >= 70)
        {
            grade = "C";
        }
        else if (score < 90 && score >= 80)
        {
            grade = "B";
        }
        else if (score <= 100 && score >= 90)
        {
            grade = "A";
        }

        System.out.printf("%s%n", grade);
        return grade;
    }
}

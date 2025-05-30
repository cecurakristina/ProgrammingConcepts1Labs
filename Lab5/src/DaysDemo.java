import java.util.Scanner;
public class DaysDemo
{
    public static void main(String args[])
    {
        int mM;
        int yY;
        Scanner keyboard = new Scanner(System.in);
        do
        {
            System.out.print("Enter a month (1-12): ");
            mM = keyboard.nextInt();
        }
        while(mM < 1 || mM > 12);
        System.out.print("Enter a year: ");
        yY = keyboard.nextInt();
        MonthDays monthDays = new MonthDays(mM, yY);
        System.out.printf("%d days", monthDays.getNumberOfDays());
    }
}

class MonthDays
{
    //fields
    private int month;
    private int year;
    private int days;
    private boolean isLeapYear;

    //constructor
    public MonthDays(int mM, int yY)
    {
        month = mM;
        year = yY;
    }

    //methods
    public int getNumberOfDays()
    {
        if (year % 100 ==  0)
        {
            if (year % 400 == 0)
            {
                isLeapYear = true;
            }
            else
            {
                isLeapYear = false;
            }
        }
        else if (year % 100 != 0)
        {
            if (year % 4 == 0)
            {
                isLeapYear = true;
            }
            else
            {
                isLeapYear = false;
            }
        }
        switch(month)
        {
            case 1,3,5,7,8,10,12:
                days = 31;
                break;
            case 4,6,9,11:
                days = 30;
                break;
        }

        if (!isLeapYear)
        {
            switch (month)
            {
                case 2:
                    days = 28;
                    break;
            }
        }
        else if (isLeapYear)
            switch (month)
            {
                case 2:
                    days = 29;
                    break;
            }
        return days;
    }
}
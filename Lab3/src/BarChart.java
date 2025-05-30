import java.util.Scanner;
public class BarChart
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        //initialize all the variables:
        int sales = 0;
        int salesOne = 0;
        int salesTwo = 0;
        int salesThree = 0;
        int salesFour = 0;
        int salesFive = 0;

        //loop 5 times to ask sales for 5 stores
        for (int i = 1; i <= 5; i++)
        {
            System.out.printf("Enter today's sales for store %d: ", i);//ask user to input sales for each store

            sales = keyboard.nextInt(); //save their input in variable sales

            //save the input in the corresponding store variables
            if (i == 1)
            {
                salesOne = sales;
            }
            else if (i == 2)
            {
                salesTwo = sales;
            }
            else if (i == 3)
            {
                salesThree = sales;
            }
            else if (i == 4)
            {
                salesFour = sales;
            }
            else if (i == 5)
            {
                salesFive = sales;
            }
        }

        //loop 5 times to print out the output for all 5 stores
        for (int j = 1; j <= 5; j++)
        {
            if (j == 1)
            {
                //for each store print: "Store x: "
                //calculate numAsterisks variable for each store inside their if statement
                //every 100 sales should be represented by 1 asterisks, so to find the number of asterisks to print we divide sales by 100
                //create a for loop that will print "*" as many times as there are asterisks that should be printed for the store
                //repeat inside each if statement for each store
                System.out.printf("Store %d: ", j);
                int numAsterisksOne = salesOne / 100;
                for (int k = 0; k < numAsterisksOne; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if (j == 2)
            {
                System.out.printf("Store %d: ", j);
                int numAsterisksTwo = salesTwo / 100;
                for (int k = 0; k < numAsterisksTwo; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if (j == 3)
            {
                System.out.printf("Store %d: ", j);
                int numAsterisksThree = salesThree / 100;
                for (int k = 0; k < numAsterisksThree; k++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
            else if (j == 4)
            {
                System.out.printf("Store %d: ", j);
                int numAsterisksFour = salesFour / 100;
                for (int k = 0; k < numAsterisksFour; k++)
                {
                    System.out.print("*");
                }
                System.out.println();

            }
            else if (j == 5)
            {
                System.out.printf("Store %d: ", j);
                int numAsterisksFive = salesFive / 100;
                for (int k = 0; k < numAsterisksFive; k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}

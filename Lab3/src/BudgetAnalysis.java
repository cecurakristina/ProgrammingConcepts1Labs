import java.util.Scanner;
public class BudgetAnalysis
{
    public static void main (String[] args)
    {
        double totalExpense = 0;
        double budgetInsight = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the amount you have budgeted for a month: ");
        double amountBudgeted = keyboard.nextDouble();
        System.out.print("How many expenses will you have this month? ");
        int expensesNum = keyboard.nextInt();

        for (int i = 1; i <= expensesNum; i++)
        {
            System.out.printf("Please enter expense %d: ", i);
            double expense = keyboard.nextDouble();
            totalExpense += expense;
        }
        budgetInsight = amountBudgeted - totalExpense;

        System.out.printf("Amount budgeted: $%.2f%n", amountBudgeted);
        System.out.printf("Amount spent: $%.2f%n", totalExpense);
        System.out.printf("You are: $%.2f away from the budget.%n", budgetInsight);
    }
}

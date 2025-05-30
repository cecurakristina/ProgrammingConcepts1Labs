//This program displays Joe's stock profit.
public class StockTransactionProgram
{
    public static void main(String[] args)
    {
        double amountPaid = 32.87 * 1000;                       //the amount Joe paid for the stock
        double commissionAmountPaid = 0.02 * amountPaid;        //commission paid when he bought the stock
        double amountSold = 1000 * 33.92;                       //the amount Joe sold the stock for
        double commissionAmountSold = 0.02 * amountSold;        //commission paid for selling the stock
        double profit = amountSold - amountPaid -commissionAmountSold - commissionAmountPaid;       //profit made

        //Print out the amounts:
        System.out.println("Amount paid: $" + amountPaid);
        System.out.println("Commission amount 1: $" + commissionAmountPaid);
        System.out.println("Amount sold: $" + amountSold);
        System.out.println("Commission amount 2: $" + commissionAmountSold);
        System.out.println("Profit: $" + profit);

    }
}

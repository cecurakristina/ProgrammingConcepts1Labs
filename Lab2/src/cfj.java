import javax.swing.*;
import java.util.Scanner;
/**Javadoc comment*/
public class cfj {
    public static void main(String[] args)
    {
        System.out.print("Enter a number between 0 and 100: ");
        Scanner userInput = new Scanner(System.in);
        int number = userInput.nextInt();

        do {
            System.out.print("Please enter a valid number: ");
            number = userInput.nextInt();
        }
        while (number > 100 || number < 0);
    }
}

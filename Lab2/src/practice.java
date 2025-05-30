import java.util.Scanner;
public class practice
{
    public static void main (String[] args)
    {
        System.out.print("Enter A, B, C or D: ");
        Scanner userInput = new Scanner(System.in);
        String selection = userInput.nextLine();

        switch(selection) {
            case "A":
                System.out.println("You selected A.");
                break;
            case "B":
                System.out.println("You selected B.");
                break;
            case "C":
                System.out.println("You selected C.");
                break;
            case "D":
                System.out.println("You selected D.");
                break;
            default:
                System.out.println("Not good with letters, eh?");
        }

    }
}

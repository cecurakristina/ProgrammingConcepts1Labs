//This program displays info about user's favourite city.
import java.util.Scanner;

public class StringManipulator {
    public static void main(String[] args) {
        System.out.print("What is your favourite city? ");              //ask for user input

        Scanner userInput = new Scanner(System.in);
        String favouriteCity = userInput.nextLine();

        //print out specific info about the city
        System.out.print("The number of characters: " + favouriteCity.length());
        System.out.print("\nTHE NAME OF THE CITY: " + favouriteCity.toUpperCase());
        System.out.print("\nthe name of the city: " + favouriteCity.toLowerCase());
        System.out.print("\nThe first character: " + favouriteCity.charAt(0));
    }
}
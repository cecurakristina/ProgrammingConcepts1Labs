//This program collects user input about themselves and incorporates it into the story.
import java.util.Scanner;

public class WordGame
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("What is your name? ");                                         //get user's name
        String name = userInput.nextLine();

        System.out.print("How old are you? ");                                          //get user's age
        int age = userInput.nextInt();

        userInput.nextLine();                                                          //absorb the newline character

        System.out.print("Where do you live? ");                                       //get user's city
        String city = userInput.nextLine();

        System.out.print("Where did you study? ");                                    //get user's college
        String college = userInput.nextLine();

        System.out.print("What is your profession? ");                               //get user's profession
        String profession = userInput.nextLine();

        System.out.print("Which animal do you have as a pet? ");                    //get user's pet type
        String animal = userInput.nextLine();

        System.out.print("What is the name of your pet? ");                         //get the name of the user's pet
        String petName = userInput.nextLine();

        //Print out the story based on the info collected from the user:
        System.out.print("There once was a person named " + name +
                " who lived in " + city +
                ". At the age of " + age +
                ", " + name + " went to college at " + college +
                ". " + name + " graduated and went to work as a " +
                profession + ". Then, " + name + " adopted a(n) " +
                animal + " named " + petName + ".  They both lived happily ever after!");
    }
}

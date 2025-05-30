/*This program displays the amount of time it will take the sound to travel a specific distance. */
import java.util.Scanner;
public class SoundSpeed
{
    public static void main (String[] args)
    {
        System.out.print("Please choose a medium: \"air\", \"water\" or \"steel\": ");

        Scanner userInput = new Scanner(System.in);

        String medium = userInput.nextLine();

        System.out.print("Please enter the distance that a sound wave will travel (in feet) in the medium: ");
        int distance = userInput.nextInt();
        double time = 0;
        if (medium.compareTo("air") == 0)
        {
            time = distance / 1100;
        }
        else if (medium.compareTo("water") == 0)
        {
            time = distance / 4900;
        }
        else if (medium.compareTo("steel") == 0)
        {
            time = distance / 16400;
        }

        System.out.print("The number of seconds it will take for your medium to travel the distance indicated is: " + time);

    }

}

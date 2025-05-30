import java.util.Scanner;
import java.io.*;
public class FIleLetterCounter
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the name of a file: ");
        String fileName = keyboard.nextLine();
        System.out.print("Please enter a character: ");
        String character= keyboard.nextLine();
        int charNum = 0;

        File myFile = new File (fileName);
        Scanner inputFile = new Scanner(myFile);

        while (inputFile.hasNext())
        {
            String fileContent = inputFile.nextLine();
            for(int i = 0; i < fileContent.length(); i++)
            {
                if (fileContent.charAt(i) == character.charAt(0))
                {
                    charNum += 1;
                }
            }
        }
        System.out.print(charNum);
        inputFile.close();
    }
}

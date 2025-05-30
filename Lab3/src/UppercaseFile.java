import java.util.Scanner;
import java.io.*;
public class UppercaseFile
{
    public static void main(String[] args) throws IOException
    {
        //initialize upperCase variable
        String upperCase = "";

        //ask the user to enter the name of a file to read
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the name of a file you want to read: ");

        //save the name of the file in a string
        String fileOne = keyboard.nextLine();

        //open the file for reading
        File fileRead = new File(fileOne);
        Scanner fileToRead = new Scanner(fileRead);

        //ask the user to enter the name of the file to write:
        System.out.print("Please enter the name of a file you want to write: ");
        String fileTwo = keyboard.nextLine();
        //open the file for writing
        PrintWriter fileToWrite = new PrintWriter(fileTwo);

        //read the content of the first file and turn it into uppercase
        while (fileToRead.hasNext())
        {
            String line = fileToRead.nextLine();
            upperCase = line.toUpperCase();
        }

        //write the upperCase string to the second file
        fileToWrite.print(upperCase);
        //close both files
        fileToRead.close();
        fileToWrite.close();
    }
}
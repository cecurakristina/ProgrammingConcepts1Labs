public class Ifelse
{
    public static void main (String[] args)
    {
        int speed = -10;
        if (speed >= 0 && speed <= 200)
        {
            System.out.println("The number is valid.");
        }
        if (speed < 0 || speed > 200)
        {
            System.out.println("The number is not valid.");
        }
    }
}

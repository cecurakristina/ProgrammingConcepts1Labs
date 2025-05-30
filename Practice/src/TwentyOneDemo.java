import java.util.Random;

public class TwentyOneDemo
{
    public static void main(String args[])
    {

    }
}

class Die
{
    private int value;

    public int roll()
    {
        Random number = new Random();
        value = number.nextInt(6) + 1;
        return value;
    }
}
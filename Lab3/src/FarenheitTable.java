public class FarenheitTable
{
    public static void main(String[] args)
    {
        float Celsius = 0;
        float Farenheit = ((float)9/5) * Celsius + 32;

        System.out.println("Celsius | Farenheit");
        System.out.println("-------------------");

        for (int i = 0; i <= 20; i ++)
        {
            System.out.printf("%6.0f  |%6.2f%n", Celsius, Farenheit);
            Celsius++;
            Farenheit = ((float) 9 /5) * Celsius + 32;
        }
    }
}

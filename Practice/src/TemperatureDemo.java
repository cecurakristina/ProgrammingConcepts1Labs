import java.util.Scanner;

public class TemperatureDemo
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the temperature in Fahrenheit: ");
        double temp = keyboard.nextDouble();

        Temperature temperature = new Temperature(temp);

        System.out.printf("Your temperature in Celsius is: %.2f%n", temperature.getCelsius());
        System.out.printf("Your temperature in Kelvin is: %.2f%n", temperature.getKelvin());
    }
}

class Temperature
{
    //fields
    private double ftemp;

    //constructor
    public Temperature(double fahrenheit)
    {
        ftemp = fahrenheit;
    }

    //setter
    public void setFahrenheit(double fahrenheit)
    {
        ftemp = fahrenheit;
    }

    //getter
    public double getFahrenheit ()
    {
        return ftemp;
    }

    //methods
    public double getCelsius()
    {
        return (5.0/9.0) * (ftemp - 32);
    }
    public double getKelvin()
    {
        return ((5.0/9.0) * (ftemp - 32)) + 273.0;
    }
}

import java.util.Scanner;
public class CircleDemo
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter circle's radius: ");
        double circleRadius = keyboard.nextDouble();
        Circle circle = new Circle(circleRadius);
        System.out.printf("The area of your circle is: %.2f.%n" +
                "The diameter of your circle is: %.2f.%n" +
                "The circumference of your circle is: %.2f.", +
                circle.getArea(), circle.getDiameter(), circle.getCircumference());
    }
}
class Circle
{
    //fields
    private double radius;
    private final double PI = 3.14159;

    //constructors
    public Circle(double circleRadius)
    {
        radius = circleRadius;
    }
    public Circle()
    {
        radius = 0.0;
    }

    //mutator
    public void setRadius(double circleRadius)
    {
        radius = circleRadius;
    }

    //accessor
    public double getRadius()
    {
        return radius;
    }

    //methods
    public double getArea()
    {
        return PI * radius * radius;
    }
    public double getDiameter()
    {
        return radius * 2;
    }
    public double getCircumference()
    {
        return 2 * PI * radius;
    }
}

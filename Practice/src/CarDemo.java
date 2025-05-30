public class CarDemo
{
    public static void main(String args[])
    {
        Car car = new Car(2018,"Toyota");

        for (int i = 0; i < 5; i++)
        {
            car.accelerate();
            System.out.println(car.getSpeed());
        }

        for (int i = 0; i < 5; i++)
        {
            car.brake();
            System.out.println(car.getSpeed());
        }
    }
}

class Car
{
    private int yearModel;
    private String make;
    private int speed;

    public Car(int yM, String mk)
    {
        yearModel = yM;
        make = mk;
        speed = 0;
    }

    public int getYearModel()
    {
        return yearModel;
    }

    public String getMake()
    {
        return make;
    }
    public int getSpeed()
    {
        return speed;
    }

    public void accelerate()
    {
        speed += 5;
    }

    public void brake()
    {
        speed -= 5;
    }
}

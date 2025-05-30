public class Car
{
    public static void main (String args[])
    {
        Car limo = new Car();
        limo.setMake("Cadillac");
    }
    private String make;
    private String yearModel;

    public void setMake(String makeInput)
    {
        make = makeInput;
    }

    public void setYearModel(String yearModelInput)
    {
        yearModel = yearModelInput;
    }

    public String getMake()
    {
        return make;
    }
    public String getYearModel()
    {
        return yearModel;
    }
}

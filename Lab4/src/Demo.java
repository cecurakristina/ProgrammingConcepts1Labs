class Pet
{
    private String name;
    private String animal;
    private int age;

    public void setName(String petName)
    {
        name = petName;
    }

    public void setAnimal(String petAnimal)
    {
        animal = petAnimal;
    }

    public void setAge(int years)
    {
        age = years;
    }

    public String getName()
    {
        return name;
    }

    public String getAnimal()
    {
        return animal;
    }

    public int getAge()
    {
        return age;
    }
}

public class Demo
{
    public static void main(String args[])
    {
        Pet myDog = new Pet();

        System.out.println("I created an object: myDog");

        myDog.setName("Jimmy");

        System.out.println("I named myDog : " + myDog.getName());
    }
}


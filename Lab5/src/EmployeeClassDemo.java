public class EmployeeClassDemo
{
    public static void main(String args[])
    {
        Employee employeeOne = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employeeTwo = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employeeThree = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        System.out.print("Name           ");
        System.out.print("ID Number    ");
        System.out.print("Department       ");
        System.out.print("Position          ");
        System.out.println();
        System.out.print("---------------------------------------------------------");
        System.out.println();
        employeeOne.print();
        employeeTwo.print();
        employeeThree.print();
    }
}

class Employee
{
    //fields
    private String name;
    private int idNumber;
    private String department;
    private String position;

    //constructors
    public Employee(String employeeName, int employeeIdNumber, String employeeDepartment, String employeePosition)
    {
        name = employeeName;
        idNumber = employeeIdNumber;
        department = employeeDepartment;
        position = employeePosition;
    }
    public Employee(String employeeName, int employeeIdNumber)
    {
        name = employeeName;
        idNumber = employeeIdNumber;
        department = "";
        position = "";
    }
    public Employee()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
    //mutators
    public void setName(String employeeName)
    {
        name = employeeName;
    }
    public void setIdNumber(int employeeIdNumber)
    {
        idNumber = employeeIdNumber;
    }
    public void setDepartment(String employeeDepartment)
    {
        department = employeeDepartment;
    }
    public void setPosition(String employeePosition)
    {
        position = employeePosition;
    }
    //accessors
    public String getName()
    {
        return name;
    }
    public int getIdNumber()
    {
        return idNumber;
    }
    public String getDepartment()
    {
        return department;
    }
    public String getPosition()
    {
        return position;
    }
    //print method
    public void print()
    {
        System.out.printf("%-15s %-10s %-15s %-20s\n", name, idNumber, department, position);
    }
}

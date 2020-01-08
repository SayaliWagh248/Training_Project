package Polymorphism;

//Base class
public class Employee

{
    //Data members
    private int eId;
    private  String eName;
    private  double salary;

    //Constructor
    public Employee(int eId, String eName, double salary)
    {
        this.eId = eId;
        this.eName = eName;
        this.salary = salary;
    }

    //Seeter & getter methods for displaying & updating private data


    public void seteId(int eId) {
        this.eId = eId;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int geteId() {
        return eId;
    }

    public String geteName() {
        return eName;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", salary=" + salary ;
    }
}

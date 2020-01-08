package Polymorphism;

public class Manager extends Employee

{
    private double hra,ta;

    {System.out.println("............I am a Manager............");}      //Instance Initializer block

    public Manager(int eId, String eName, double salary,double hra,double ta)
    {
        super(eId, eName, salary);
        this.hra=hra;
        this.ta=ta;

        System.out.println("Inside Manager constructor");
    }

    public double getHra() {
        return hra;
    }

    public double getTa() {
        return ta;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    public void setTa(double ta) {
        this.ta = ta;
    }


    @Override
    public String toString()
    {   return
      "Manager{"+""
              +super.toString()+" "+
                "hra=" + hra +
                ", ta=" + ta +
                '}';
    }
}

package Polymorphism;

public class Worker extends Employee

{
    private double ot;
    {System.out.println(".....I am a Worker....");}                              //Instance Initializer block


    public Worker(int eId, String eName, double salary,double ot)
    {
        super(eId, eName, salary);
        this.ot=ot;
        System.out.println("Inside worker constructor");
    }

    public double getOt() {
        return ot;
    }

    public void setOt(double ot) {
        this.ot = ot;
    }

    @Override
    public String toString() {
        return "Worker{" +super.toString()+" "+
                "ot=" + ot +
                '}';
    }
}

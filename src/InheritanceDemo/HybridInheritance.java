package InheritanceDemo;

abstract class Vehicle
{
    abstract void run();
}

 class TwoWheeler extends Vehicle
{
     void getSpeed()
     {
         System.out.println("The speed of two wheeler is 80km/h ");
     }

    @Override
    void run()
    {
        System.out.println("Bike is Running ");
    }
}


 class FourWheeler extends Vehicle implements Automatic
{
     void getSpeed()
     {
        System.out.println("Speed is 100km/hr ");
     }

    @Override
    public void display()
    {
        System.out.println("Car has auto gear system");
    }

    @Override
    void run()
    {
            System.out.println("Car is Running");
    }
}



public class HybridInheritance

{
    public static void main(String [] args)

    {
        TwoWheeler v1=new TwoWheeler();

        v1.run();
        v1.getSpeed();

        System.out.println();

        FourWheeler v2=new FourWheeler();
        v2.run();
        v2.getSpeed();
        v2.display();
    }
    }

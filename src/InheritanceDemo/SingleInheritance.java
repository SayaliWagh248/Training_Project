package InheritanceDemo;

//Parent class
class Base
{
    public Base()
    {
        System.out.println("I am Base class");
    }
}

//child class extending parent
class Derived extends Base
{
    public Derived()
    {
        System.out.println("I am Derived class");
    }

}

//Driver code
public class SingleInheritance

{
    //main method
    public static void main(String[] args)
    {

        //Object Creation
        Derived d=new Derived();

    }
}

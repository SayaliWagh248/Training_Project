package InheritanceException;

class Parent6
{
    public void method()
    {
        System.out.println("Parent");
    }
}
public class Demo6 extends Parent6 {

    public void method()throws ArithmeticException
    {
        System.out.println("Parent method without exception & child with unchecked exception");
    }

    public static void main(String[] args)
    {
        Demo6 d6=new Demo6();
        d6.method();
    }
}

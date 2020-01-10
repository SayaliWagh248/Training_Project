package InheritanceException;

import java.io.IOException;

class Parent4{
    public void method()throws IOException
    {
        System.out.println("Parent");
    }
}
public class Demo2 extends Parent4{
    public void method()throws ArithmeticException
    {
        System.out.println("Parent throwing Checked exception & child throwing unchecked");
    }

    public static void main(String[] args)
    {
        Demo2 d2=new Demo2();
        d2.method();
    }
}

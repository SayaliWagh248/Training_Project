package InheritanceException;

import java.io.IOException;

class Parent
{
    public void method()throws ArithmeticException
    {
        System.out.println("Parent");
    }
}
// If parent method throwing unchecked exception child's overriding method can't throw Checked Exception
/*public class Demo4 extends Parent {
    public void method()throws IOException
    {

    }
}*/

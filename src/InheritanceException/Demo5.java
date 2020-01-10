package InheritanceException;

import java.io.IOException;

class Parent5
{
    public void method()
    {
        System.out.println("Parent");
    }
}
public class Demo5 {
    public void method() throws IOException
    {
        System.out.println("Parent method without exception & child overriding method with checked exception");
    }

    public static void main(String[] args)
    {
        try{
            Demo5 d=new Demo5();
            d.method();
        }
      catch (IOException e)
      {
          e.printStackTrace();
      }

    }
}

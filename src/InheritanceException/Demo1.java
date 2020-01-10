package InheritanceException;

import java.io.IOException;
class Parent3 {

    public void test()throws IOException
    {
        System.out.println("Parent");
    }
}


public class Demo1 extends Parent3{
    public void test()
    {
        System.out.println("Demo");
    }

    public static void main(String args[])
    {
        Demo1 d=new Demo1();
        d.test();
    }
}
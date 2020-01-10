package InheritanceException;

import java.io.IOException;

public class Demo3 extends Parent2{

    public void test()throws IOException
    {
        System.out.println("Parent & child both throwing Checked Exception");
    }

    public static void main(String[] args)
    {
        try
        {
            Demo3 d3=new Demo3();
            d3.test();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }

    }
}

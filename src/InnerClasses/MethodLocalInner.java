package InnerClasses;

class Outer

{
     int x=20;
    void OuterMethod()
    {
        System.out.println("Inside Outer class's method");

       class  Inner
        {
            void innerMethod()
            {
                System.out.println("Inside Inner class's method");
                System.out.println("x= "+x);
            }
        }
        Inner in=new Inner();
        in.innerMethod();
    }
}


public class MethodLocalInner {

    public static void main(String[] ar)
    {
        Outer out=new Outer();
        out.OuterMethod();
    }
}

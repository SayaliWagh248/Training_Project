package InnerClasses;

public class nestedInner {

    private int data=200;


    class Inner1
    {
        public void show()
        {
            System.out.println("The data obtain from outer class "+data);
        }


        //static method never goes with nested inner cause it depends upon object of outer class
       /* public static  void  display()
        {

        }

        output-Error illegal static declaration in inner class
                Outer.Inner public static void main(String[] args)
                modifier ‘static’ is only allowed in constant
                variable declaration
        */

    }

    public static void main(String[] ar)
    {
        nestedInner.Inner1 i=new nestedInner().new Inner1();
        i.show();
    }
}

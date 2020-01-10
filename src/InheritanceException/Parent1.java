package InheritanceException;

public class Parent1 {

    public void test()
    {
        System.out.println("Parent");
    }
}
      class  Child extends Parent1
      {

        public void test()throws ArithmeticException
        {
            System.out.println("Child");
        }

        public static void main(String args[])
        {
            Child c=new Child();
            c.test();
        }
      }

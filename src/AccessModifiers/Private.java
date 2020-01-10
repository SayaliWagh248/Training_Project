package AccessModifiers;
class A
{
    private int data=50;
    private  void msg()
    {
        System.out.println("Private method of class A");
    }
}
public class Private {

   public static void main(String[] args)
   {
       A a =new A();

       /*System.out.println(a.data);//CTE

       a.msg();//CTE*/
   }

}

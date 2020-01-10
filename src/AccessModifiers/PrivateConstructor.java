package AccessModifiers;
class AA
{
    private AA()
    {
        System.out.println("Inside private constructor");
    }
}
public class PrivateConstructor {
    public static void main(String[] args)
    {
        //AA aa=new AA();                      //----------------------CTE
    }
}

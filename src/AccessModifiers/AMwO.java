package AccessModifiers;
class AB{
    private void msg(){System.out.println("Hello java");}
}


public class AMwO extends AB{
    public void msg()
    {
        System.out.println("Hello java");
    }                                                            //C.T.Error
    public static void main(String args[])
    {
        AMwO obj=new AMwO();
        obj.msg();
    }
}


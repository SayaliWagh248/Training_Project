package InnerClasses;

public class AnonymousAsSub {

    public void  show()
    {
        System.out.println("Showing...............");
    }


    static AnonymousAsSub SubClass=new AnonymousAsSub()
    {
       public void  show()
        {
            System.out.println("Showing from Sub class...............................................");
        }
    };

    public static void main(String[] arg)
    {
        SubClass.show();
    }
}

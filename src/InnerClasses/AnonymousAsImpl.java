package InnerClasses;

interface  Hello
{
    public void hi();
}
public class AnonymousAsImpl {

    static Hello h=new Hello() {
        @Override
        public void hi() {
            System.out.println("Anonymous Inner class as a implementer");
        }
    };

    public static void main(String[] ar)
    {
        h.hi();
    }
}

public class Print implements Printable {


    @Override
    public void print() {
            System.out.println("Inside Print Method");
    }

    public static void main(String[] ar)
    {
        Print p=new Print();
        p.print();
        p.show();
    }
}

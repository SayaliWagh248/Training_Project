package AbstractionDemo;

//Driver class
public class Test

{
    //main method
    public static void main(String[] args)
    {
        //Instantiating child classes
        Shape s1=new Circle("Black",3.5);

        Circle c=new Circle("Blue",4.5);

        Shape s2=new Square("Red",2);

        //calling methods
        System.out.println(c.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}

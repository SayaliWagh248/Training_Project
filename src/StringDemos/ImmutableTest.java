package StringDemos;

//Class showing immutable behaviour of String
public class ImmutableTest

{
    public static void main(String[] ar)
    {
        //created string using new keyword
        String s=new String("Hello");

        //Printing the string before updating
        System.out.println(s);

        //trying to update the string using concat method
        s.concat("World");

        //Printing the string after updating
        System.out.println(s);

        //created string using new keyword
        String s1=new String("Welcome");

        //Printing the string before updating
        System.out.println(s1);

        //explicitly assigning string object to reference variable
        s1=s1.concat("to java");

        //Printing the string after updating
        System.out.println(s1);


    }
}

package StringDemos;

public class CreatingStrings

{
    public static void main(String ar[])
    {
        //String creation using java String literals
        String s1="Java Team";

        //Char array
        char ch[]={'p','e','r','e','n','n','i','a','l'};

        //Creating string by converting char array to string
        String  s2= new String(ch);

        //Creating String using new keyword
        String s3=new String("System");

        //Printing Strings
        System.out.println(" "+s1);
        System.out.println(" "+s2);
        System.out.println(" "+s3);

    }
}

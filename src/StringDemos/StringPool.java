package StringDemos;

public class StringPool

{
    public static void main(String[] args)
    {
        //Using string literals
        String s1="Hello";
        String s2="Hello";

        //Using new Keyword
        String s3=new String("Hello");

        System.out.println(s1==s2);

        System.out.println(s1==s3);

        System.out.println(s2==s3);
    }
}

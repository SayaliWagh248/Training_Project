package StringDemos;

public class CompareToMethod

{
    public static void main(String[] args)
    {
        //Using string literals
        String s1 = "Hello";
        String s2 = "Mello";
        String s3 = "Hemlo";
        String s4 = "";
        String s5 = "Hello";

        System.out.println(s1.compareTo(s2));           //return -5 as "H" is 5 time lower to "M"

        System.out.println(s1.compareTo(s3));            //return -1 as "l" is 1 time lower to "m"

        System.out.println(s1.compareTo(s5));            //return o as both are equal

        System.out.println(s1.compareTo(s4));           //return length of string as second one is empty

    }
}

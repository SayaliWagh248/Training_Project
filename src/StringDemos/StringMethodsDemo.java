package StringDemos;

public class StringMethodsDemo

{

    public static void main(String[] args)
    {
        String s1=new String("Java is Object Oriented Language");

        String s2=new String("Java is Object Oriented Language");

        String s3= "Java is Object Oriented Language";

        String s4="JAVA IS OBJECT ORIENTED LANGUAGE";



        System.out.println("--------------------------------------------contains Method-------------------------------------------------------");

        System.out.println(s1.contains("Java"));

        System.out.println(s1.contains("java"));

        System.out.println(s1.contains("Object Oriented Language"));

        System.out.println(s1.contains("Java is not"));



        System.out.println("--------------------------------------------endsWith Method-------------------------------------------------------");

        System.out.println(s1.endsWith("e"));

        System.out.println(s1.endsWith("Language"));

        System.out.println(s1.endsWith("Oriented"));



        System.out.println("--------------------------------------------equals Method-------------------------------------------------------");

        System.out.println(s1.equals(s2));               //equals

        System.out.println(s1.equals(s3));               //equals

        System.out.println(s1.equals(s4));               //not equals

        System.out.println(s3.equals(s4));               //equals but case is different



        System.out.println("--------------------------------------------equalsIgnoreCase Method-------------------------------------------------------");

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s3.equalsIgnoreCase(s4));


        System.out.println("--------------------------------------------format Method-------------------------------------------------------");


        String str1=String.format("%d",1024);           //Integer value

        String str2=String.format("%f",102.456);        //floating value

        String str3=String.format("%x",101);             //Hexadecimal value

        String str4=String.format("%c",90);             //Character value

        String str5=String.format("%s","Java");         //String value


        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);


        System.out.println("--------------------------------------------getBytes Method-------------------------------------------------------");

        byte barr[]=s1.getBytes();

        for (int i:barr)
        {
            System.out.println(i);
        }



        System.out.println("--------------------------------------------getChars Method-------------------------------------------------------");

        char c[]=new char[24];

        s1.getChars(8,32,c,0);

        System.out.println(c);



        System.out.println("--------------------------------------------indexOf Method-------------------------------------------------------");

        System.out.println(s1.indexOf("Java"));

        System.out.println(s1.indexOf("is"));



        System.out.println("--------------------------------------------intern() Method-------------------------------------------------------");

        String s5=new String("Mango");

        String  s6="  Mango   ";

        String s7=s5.intern();              //returns string from pool, now it will be same as s6

        System.out.println(s7==s5);         //false because reference variables are pointing to different instance

        System.out.println(s6==s7);          //true because reference variables are pointing to same instance

        System.out.println(s5);



        System.out.println("-------------------------------------------- isEmpty() Method-------------------------------------------------------");

        String s8="" ;

        System.out.println(s8.isEmpty());

        System.out.println(s7.isEmpty());


        System.out.println("-------------------------------------------- join() Method-------------------------------------------------------");

        String s9=String.join("-","Welcome","to","Java");

        System.out.println(s9);



        System.out.println("--------------------------------------------  lastIndexOf() Method-------------------------------------------------------");

        int index=s9.lastIndexOf("a");

        System.out.println(index);



        System.out.println("--------------------------------------------  length() Method-------------------------------------------------------");

        System.out.println("The length of string is "+s9.length());



        System.out.println("--------------------------------------------   replace() Method-------------------------------------------------------");

        String s10=str5.replace('a','i');

        System.out.println(s10);


        System.out.println("--------------------------------------------   replaceAll() Method-------------------------------------------------------");

        String s11=s1.replaceAll("a","x");

        System.out.println(s11);



        System.out.println("--------------------------------------------   split() Method-------------------------------------------------------");

        String word[]=s1.split("\\s");              //splits the string based on whitespace

        for (String w:word)
        {
            System.out.println(w);
        }



        System.out.println("-------------------------------------------- startsWith() Method-------------------------------------------------------");

        System.out.println(s1.startsWith("J"));

        System.out.println(s1.startsWith("j"));

        System.out.println(s1.startsWith("Java"));



        System.out.println("-------------------------------------------- substring() Method-------------------------------------------------------");

        System.out.println(s1.substring(15));

        System.out.println(s1.substring(8,14));



        System.out.println("-------------------------------------------- toCharArray() Method-------------------------------------------------------");

        char c1[]=s1.toCharArray();

        for (char i:c1)
        {
            System.out.print(i+"-");
        }


        System.out.println("-------------------------------------------- toLowerCase() Method-------------------------------------------------------");

        String s12=s1.toUpperCase();

        System.out.println(s12);



        System.out.println("-------------------------------------------- toUpperCase() Method-------------------------------------------------------");

        String s13=s12.toLowerCase();

        System.out.println(s13);




        System.out.println("-------------------------------------------- trim() Method-------------------------------------------------------");

        System.out.println(s6.trim());


        System.out.println("-------------------------------------------- valueOf() Method-------------------------------------------------------");
        int value=30;

        String s14=String.valueOf(value);

        System.out.println(s14+1000);



    }
}

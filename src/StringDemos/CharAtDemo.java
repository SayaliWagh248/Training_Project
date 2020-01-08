package StringDemos;

public class CharAtDemo

{

    public static void main(String [] ar)
    {
        char ch[]={'p','e','r','e','n','n','i','a','l'};
        String s=new String(ch);

       for(char i=0; i<ch.length; i++)
       {
           System.out.println(s.charAt(i));
       }
    }
}

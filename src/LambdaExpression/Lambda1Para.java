package LambdaExpression;

interface  Sayable1
{
    public String say(String name);
}


public class Lambda1Para {

    public static void main(String[] a)
    {
        Sayable1 s1=(name)->{
         return "Hello "+name;
        };

        System.out.println(s1.say("ABC"));

        //We can also omit function parenthesis

        Sayable1 s2=name -> {
          return  "Hi "+name;
        };
        System.out.println(s2.say("PQR"));
    }
}

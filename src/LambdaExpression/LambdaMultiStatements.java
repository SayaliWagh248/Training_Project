package LambdaExpression;

interface Sayable3{
    public String say(String message);
}


public class LambdaMultiStatements {

    public static void main(String[] ar)
    {
        Sayable3 s3=(String message)->{
          String str1="I would like to say that, ";
          String str2=str1+message;
          return str2;
        };

        System.out.println(s3.say("time is precious"));
    }
}

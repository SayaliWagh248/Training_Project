package LambdaExpression;

interface Sayable{
    public String say();
}

public class LambdaNoPara {

    public static void main(String[] a)
    {
        Sayable s=()->
        {
            return "Nothing to say";
        };

        System.out.println(s.say());
    }

}

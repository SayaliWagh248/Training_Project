package LambdaExpression;

interface Eatable{
    public void eat();
}

public class LambdaExp {
    public static void main(String[] ar)

    {
        String Fruit="Apple";
        Eatable e=()->{
            System.out.println("Eating "+ Fruit);
        };

        e.eat();
    }
}

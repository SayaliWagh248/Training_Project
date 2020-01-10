package LambdaExpression;

interface Drawable{
    public void draw();
}


public class AnonymousClass {

    public static void main(String[] ar)
    {

        int width=10;

        Drawable d=new Drawable() {
            @Override
            public void draw() {

                System.out.println("Drawing "+width);
            }
        };
        d.draw();
    }
}

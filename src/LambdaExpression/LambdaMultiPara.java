package LambdaExpression;

interface Addable
{
    public int add(int a,int b);
}


public class LambdaMultiPara {
    public static void main(String[] ar)
    {
        Addable a1=(a,b)->(a+b);
        System.out.println(a1.add(10,20));


        //Lambda Expression with data types
        Addable a2=(int a,int b)->(a+b);
        System.out.println(a2.add(30,50));


        //Lambda with return statement

        Addable a3=(a,b)->
        {
            return (a+b);
        };
        System.out.println(a3.add(100,400));
    }
}

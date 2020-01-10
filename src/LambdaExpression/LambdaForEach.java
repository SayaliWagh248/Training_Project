package LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaForEach {
    public static  void main(String[] ar)
    {
        List<String> l=new ArrayList<String>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("A");
        l.add("B");


        l.forEach(
                (n)->System.out.println(n)
        );
    }
}

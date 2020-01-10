import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] ar)
    {
        StringJoiner joins=new StringJoiner("......");

        joins.add("A");
        joins.add("B");
        joins.add("C");
        joins.add("D");
        joins.add("E");


        System.out.println(joins);
    }
}

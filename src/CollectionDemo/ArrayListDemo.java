package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<String>();

        al.add("A");
        al.add("B");
        al.add("c");
        al.add("A");

      /*  Iterator<String> it=al.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }*/

        for (String obj:al)
        {
         System.out.println(obj);
        }
    }


}

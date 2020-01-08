package StringBufferDemo;

public class MethodsDemo

{
    public static void main(String[] ar)
    {
        StringBuffer sb=new StringBuffer("Hello");

        System.out.println(sb);

        System.out.println("----------------------------------------------append() Method---------------------------------------------------------");

        sb.append("Java");

        System.out.println(sb);


        System.out.println("----------------------------------------------insert() Method---------------------------------------------------------");

        sb.insert(2,"Java");

        System.out.println(sb);


        System.out.println("----------------------------------------------replace() Method---------------------------------------------------------");

        sb.replace(2,6,"");

        System.out.println(sb);


        System.out.println("----------------------------------------------delete() Method---------------------------------------------------------");

        sb.delete(5,7);

        System.out.println(sb);



        System.out.println("----------------------------------------------reverse() Method---------------------------------------------------------");

        sb.reverse();

        System.out.println(sb);


        System.out.println("----------------------------------------------capacity() Method---------------------------------------------------------");

        System.out.println(sb.capacity());

        sb.append("asdfghjklzxcvbnm");

        System.out.println(sb.capacity());


        System.out.println("----------------------------------------------ensureCapacity() Method---------------------------------------------------------");

         sb.ensureCapacity(10);                     // no change

        sb.ensureCapacity(50);                      //(old capacity*2)+2=44*2+2=90

        System.out.println(sb.capacity());


    }
}

package StringBuilderDemo;



public class MethodsDemo

{
    public static void main(String[] ar)
    {
        StringBuilder sBuild=new StringBuilder("Hello");

        System.out.println(sBuild);

        System.out.println("----------------------------------------------append() Method---------------------------------------------------------");

        sBuild.append("Java");

        System.out.println(sBuild);


        System.out.println("----------------------------------------------insert() Method---------------------------------------------------------");

        sBuild.insert(2,"Java");

        System.out.println(sBuild);


        System.out.println("----------------------------------------------replace() Method---------------------------------------------------------");

        sBuild.replace(2,6,"");

        System.out.println(sBuild);


        System.out.println("----------------------------------------------delete() Method---------------------------------------------------------");

        sBuild.delete(5,7);

        System.out.println(sBuild);



        System.out.println("----------------------------------------------reverse() Method---------------------------------------------------------");

        sBuild.reverse();

        System.out.println(sBuild);


        System.out.println("----------------------------------------------capacity() Method---------------------------------------------------------");

        System.out.println(sBuild.capacity());

        sBuild.append("qwerty");

        System.out.println(sBuild.capacity());


        System.out.println("----------------------------------------------ensureCapacity() Method---------------------------------------------------------");

        sBuild.ensureCapacity(10);                     // no change

        sBuild.ensureCapacity(80);                      //(old capacity*2)+2=44*2+2=90

        System.out.println(sBuild.capacity());


    }
}

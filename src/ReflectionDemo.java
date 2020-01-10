import EncapsulationDemo.TestEmp;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

class Test
 {
     private String s;

     public Test()
     {
         s="Welcome";
     }

     public void method1()
     {
         System.out.println("The string is:- "+s);
     }

     private void method2(int n)
     {
         System.out.println("The number entered is:- "+n);
     }
 }

 public class ReflectionDemo

 {
     public static void main(String arg[]) throws Exception
     {
             Test t=new Test();

             Class cl=t.getClass();
             System.out.println("Class Name is: "+cl.getName());

         Constructor con=cl.getConstructor();
         System.out.println("The name of Constructor is:- "+con.getName());

         Method[] methods=cl.getMethods();
         for (Method method:methods) {
             System.out.println(method.getName());
         }

         Method methodCall1=cl.getDeclaredMethod("method1");
         methodCall1.setAccessible(true);
         methodCall1.invoke(t);


         Method methodCall2=cl.getDeclaredMethod("method2", int.class);
         methodCall2.setAccessible(true);
         methodCall2.invoke(t,24);
     }
 }
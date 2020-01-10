import java.util.Scanner;

public class AssertDemo {

    public static void main(String[] ar)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age:- ");

        int age=sc.nextInt();

        assert age>=18:"Not valid";

        System.out.println("value is - "+age);
    }
}

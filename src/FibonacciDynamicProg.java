import java.util.Scanner;

public class FibonacciDynamicProg

{
    public static int fib(int n)
    {
        int f[]=new int [n+2];

        f[0]=0;
        f[1]=1;

        for(int i=2; i<f.length; i++)
        {
           f[i]=f[i-1]+f[i-2];
        }

        return f[n];
    }

    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter number to find fibonacci:- ");

        int num=sc.nextInt();

        System.out.println(fib(num));
    }
}

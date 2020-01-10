import java.util.Scanner;

public class RecursiveFactorial

{
    int output=0;
    public  int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
            {
             output=fact(n-1)*n;
        }
        return output;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number to print factorial:- ");
        int n=sc.nextInt();


        RecursiveFactorial rfact=new RecursiveFactorial();
       int result= rfact.fact(n);

       System.out.println("The factorial of "+n+" is:= "+result);
    }
}

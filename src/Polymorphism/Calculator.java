package Polymorphism;

//Driver class
public class Calculator

{
    public static void main(String[] args)
    {
            Addition ad=new Addition();

            //Overloaded add method are called
            System.out.println("\n The addition is: "+ad.add(12,23,45,56,766,43));

            System.out.println("\n The addition is: "+ad.add(234.009,354.67,34.65,234.98,23.877));


    }
}

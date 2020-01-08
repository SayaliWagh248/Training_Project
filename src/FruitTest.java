class Fruit
{
    public Fruit()
    {
        System.out.println("Inside SUPER Class constructor!");

        System.out.println("Super class object hashcode "+this.hashCode());

        System.out.println("Super class class name "+this.getClass().getName());
    }

}

class Apple extends Fruit
{
    public Apple()
    {

        System.out.println("Inside Sub class constructor!!! ");

        System.out.println("Sub class object code "+this.hashCode()+" "+super.hashCode());

        System.out.println("Sub class class name "+this.getClass().getName()+" "+super.getClass().getName());
    }
}

public class FruitTest

{
    public static void main(String[] args)
    {
       // Fruit f1=new Fruit();

         Fruit f2=new Apple();

        //Apple app=new Apple();
    }
}

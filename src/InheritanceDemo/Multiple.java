package InheritanceDemo;

//class implementing interfaces
class MastaniIceCream implements Drinkable,Eatable
{

    @Override
    public void drinking()
    {
        System.out.println("hey I am drinkable");
    }

    @Override
    public void eating()
    {
        System.out.println("hey I am Eatable");
    }
}

//Driver class
public class Multiple

{
    //main method
 public static void main(String[] args)
 {
     //Object creation
     MastaniIceCream ice=new MastaniIceCream();

     //calling methods
     ice.drinking();
     ice.eating();
 }

}

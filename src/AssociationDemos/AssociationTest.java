package AssociationDemos;

public class AssociationTest

{
    public static void main(String[] args)
    {
        Bank b=new Bank("Union");
        Employee e=new Employee("Priyanka");

        System.out.println(e.getEmpName()+" is a employee of "+b.getBankName()+ " Bank.");
    }
}

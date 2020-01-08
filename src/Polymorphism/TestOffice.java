package Polymorphism;


//Driver code for Employee Details Run Time Polymorphism
public class TestOffice

{

    public static void main(String[] args)
    {
        System.out.println("\n Main method get called");

        //Array of objects
        Employee e[]=new Employee[2];

        //up casting Manager into Employee
        e[0]=new Manager(1,"Nikhil",50000,5000,10000);

        //up casting Worker into Employee
        e[1]=new Worker(34,"Harish",20000,5000);

        //for each loop to iterate over array of objects
        for (Employee emp:e)

        {
            //Checking if object is of manager type
            if(emp instanceof Manager)
            {
               System.out.println(emp.toString());
            }

            //Checking if object is of worker type
           else if(emp instanceof  Worker)
            {
                System.out.println(emp.toString());
            }
        }
    }
}

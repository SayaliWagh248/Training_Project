package EncapsultionData;

import EncapsultionData.EmployeeDetails;

import java.util.Date;
import java.util.EmptyStackException;

public class Office extends EmptyStackException

{
    public static void main(String [] args)
    {
        EmployeeDetails ed=new EmployeeDetails();

        ed.seteId(1);
        ed.seteName("Shreyan");
        ed.setDob(new Date(2000,10,24));
        ed.setAddress("Pune");


        System.out.println("\n Employee id is: "+ed.geteId());
        System.out.println("\n Employee name is: "+ed.geteName());

        System.out.println("\n Employee's date of birth is: "+ed.getDob());
        System.out.println("\n Employee's address is: "+ed.getAddress());
    }
}

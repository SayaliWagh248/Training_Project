package EncapsulationDemo;

import java.util.Date;

public class TestEmp {

    public static void main(String[] args)
    {
        Employee e=new Employee();

        e.seteID(1);
        e.seteName("ABC");
        e.setEAddress("Pune");
        e.seteDOB(new Date(2019, 11, 24));


        System.out.println("Employee Id:  " + e.geteID() + " Employee Name: " + e.geteName() + " Employee Address: " + e.getEAddress() + " Employee DOB: " + e.geteDOB());
    }
}

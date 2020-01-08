package AggregationDemo;

import java.util.ArrayList;
import java.util.List;

//Driver class
public class AggregationTest

{
    //Main Method
    public static void main(String[] args)
    {
        //Instances of Student class & initializing them using Constructor
        Student s1=new Student(1,"Pratiksha","CSE");
        Student s2=new Student(2,"Ketaki","ME");
        Student s3=new Student(3,"Vaibhav","ME");
        Student s4=new Student(4,"Kaustubh","CSE");

        //Creating List of CSE department students
        List<Student> cseStud =new ArrayList<>();
        cseStud.add(s1);
        cseStud.add(s4);

        //Creating List of ME department students
        List<Student> meStud=new ArrayList<>();
        meStud.add(s2);
        meStud.add(s3);

        //Instantiating Department class
        Department CSE=new Department("CSE",cseStud);
        Department ME=new Department("ME",meStud);

        //Creating List of departments
        List<Department> departments=new ArrayList<Department>();
        departments.add(CSE);
        departments.add(ME);

        //Instantiating Institute class
        Institute institute=new Institute("NESGOI",departments);

        //calling getTotalNumOfStudentInInstitute on Institute's object
        System.out.println("Total number of  students in Institute are:- "+institute.getTotalNumOfStudentInInstitute());


    }
}

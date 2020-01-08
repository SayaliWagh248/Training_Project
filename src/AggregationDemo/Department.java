package AggregationDemo;

import java.util.List;

public class Department

{
    //Declaring variable for department name
    private String deptName;

    //Declaring list of students
    private List<Student> students;


    //Constructor
    public Department(String deptName, List<Student> students)
    {
        this.deptName=deptName;
        this.students=students;
    }

    //Method to obtain Students
    public List getStudents()
    {
        return  students;
    }

}

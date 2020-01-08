package AggregationDemo;

import java.util.List;

public class Institute

{
    //
   private String instName;
   private List<Department> departments;

   //Constructor
   public Institute(String instName,List<Department> departments)
   {
       this.instName=instName;
       this.departments=departments;
   }

   //Method to obtain total number of students from Institute
   public int getTotalNumOfStudentInInstitute()
   {
       //Declaring variable to store student's count
       int noOfStudents=0;

       //Declaring Student List
       List<Student> students;

       //for each loop for iterating departments list
       for (Department dept:departments)
       {
           //Getting students into Student list from department
            students=dept.getStudents();

            //for each loop to iterate over students list
           for (Student stud:students)
           {
               //Incrementing students count
               noOfStudents++;
           }
       }
       //returning student's count
       return noOfStudents;
   }
}

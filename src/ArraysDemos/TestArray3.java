package ArraysDemos;

import java.util.Arrays;

public class TestArray3

{
    public static void main(String[] arg)
    {
        char c[]={'s','a','y','a','l','i'};      //Declaring & Initializing char array

                for (char i:c)                     //For-each loop for printing char array
        {
            System.out.println(i);
        }

        for (int i:c)                     //For-each loop for printing char array into ASCII values
        {
            System.out.println(i);
        }


        Arrays.parallelSort(c);                 //Method to perform parallel sorting over char array

        System.out.println("Array elements after sorting");

        for(char i:c)                           //for-each loop for printing sorted char array
        {
            System.out.println(i);
        }
    }
}

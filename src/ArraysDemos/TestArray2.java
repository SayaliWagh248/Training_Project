package ArraysDemos;

import java.util.Arrays;

public class TestArray2

{
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40,50,50};          //Array declaration & initialization

        for(int i:arr)                          //for-each loop for printing array
        {
            System.out.println(i+ "");          //printing array elements
        }

        Arrays.parallelSort(arr);               //using java 8's new feature parallelSort for sorting array elements

        System.out.println("After Parallel sorting ");

        for(int i:arr)                          //for-each loop for printing sorted array elements
        {
            System.out.println(i+ "");
        }
    }
}

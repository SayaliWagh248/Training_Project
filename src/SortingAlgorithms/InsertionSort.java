package SortingAlgorithms;

import java.util.Scanner;

public class InsertionSort
{
    public void insertionSort(int arr[])
    {
        int n=arr.length;
        int count=1;
        for (int j=1; j<n; j++)
        {
           int key=arr[j];
            int i=j-1;

            while ((i>-1) && (arr[i]>key))
            {

                arr[i+1]=arr[i];

                i--;

            }
            arr[i+1]=key;
            System.out.println("\n After the "+count+" pass:= ");
            for (int k:arr)
            {

                System.out.print(k+ " ");
            }
            count++;
        }
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array:- ");
        int size=sc.nextInt();

        int array[]=new int[size]; //Initializing Array
        System.out.println("Enter the array elements one by one:- ");
        for (int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }

        InsertionSort is=new InsertionSort();
        is.insertionSort(array);

        System.out.println("\n\n After performing insertion sort:- \n");
        for (int i:array)
        {

            System.out.print(i+ " ");
        }

    }

}
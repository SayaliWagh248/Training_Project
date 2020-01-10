package SortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {

    public static void performSorting(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int min_idx=i;
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[min_idx])
                    min_idx=j;

                int temp=arr[min_idx];
                arr[min_idx]=arr[i];
                arr[i]=temp;
            }

        }
    }

    public static void printArray(int arr[])
    {

        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }

    public static void main(String[] ars)
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

        performSorting(array);
        printArray(array);
    }
}

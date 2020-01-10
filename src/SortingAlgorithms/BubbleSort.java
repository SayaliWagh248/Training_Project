package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {

    public static void performBubbleSort(int arr[])
    {
        int n=arr.length;

        for (int i=0; i<n-1; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }

            System.out.println("\n\n Pass number "+i+" =");
            printSortedArray(arr);
        }
    }

    public static void printSortedArray(int arr[])
    {

        for (int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
    }

    public static void main(String[] args)
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

        performBubbleSort(array);

        System.out.println("\n\n Final Sorted Array using bubble sort");
        printSortedArray(array);
    }
}

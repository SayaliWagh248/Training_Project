package SearchingAlgorithm;

import java.util.Scanner;

public class LinearSearch
{
    //Method for linear search
    public static int search(int arr[],int item)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(item==arr[i])
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        //Accepting array size from user
        System.out.println("Enter the size of array:- ");
        int size=sc.nextInt();

        //Initializing array
        int arr[]=new int[size];

        //Accepting array element from User
        System.out.println("Enter the array elements one by one:- ");
        for(int i=0;i<size;i++)
        {
           arr[i]=sc.nextInt();
        }

        //Accepting element to be searched from user
        System.out.println("Enter element to be searched:- ");
        int key=sc.nextInt();

        //Calling search method
        int result=search(arr,key);

        if(result==-1)
        {
            System.out.println("The element is not  present ");
        }
        else
        {
            System.out.println("The element "+result+" is present");
        }

    }
}

package SearchingAlgorithm;

import java.util.Scanner;

public class BinarySearch {

    int binarySearch(int arr[], int lowIndex, int highIndex, int x)
    {
        if (highIndex >= lowIndex) {
            int mid = lowIndex + (highIndex - lowIndex) / 2;

           //check if element is present at middle position
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then search only left sub array of mid
            if (arr[mid] > x)
                return binarySearch(arr, lowIndex, mid - 1, x);

            // Else the element can only be present in the right sub array of mid
            return binarySearch(arr, mid + 1, highIndex, x);
        }

        // element is not present
        return -1;
    }


    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        Scanner sc=new Scanner(System.in);

        //Accepting size of array from user
        System.out.println("Please enter the size of array:- ");
        int size=sc.nextInt();

        //Initializing ARRAY
        int arr[] = new int[size];

        //Accepting array element from user
        System.out.println("Enter the element of array one by one");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

        int n = arr.length;

        //Accepting element to be searched from user
        System.out.println("Enter element to be searched:- ");
        int x = sc.nextInt();

        //Calling search method
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }

}

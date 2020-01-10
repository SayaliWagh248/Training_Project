package ArraysDemos;

public class ArrayArg {

    static void min(int arr[])
    {
        int min=arr[0];                         //Variable declaration & initialization
        for (int i=0;i<=arr.length-1;i++)       //loop for comparing with array elements
        {
            if (min>arr[i])                     //Checking min element
                min=arr[i];                     //assigning value of min element to the min variable

        }
        System.out.println(min);                //Printing min element
    }

    public static void main(String[] args)      //Driver code
    {
        int s[]={45,76,24,12};                  //Array
        min(s);

        min(new int[]{2,65,34,44,1,9,78});      //Anonymous Arrays
    }
}

package ArraysDemos;

public class ReturnArray {

    static int[] get()   //Method for Returning array from a method
    {
        return new int[]{11,22,33,44,55};           //returning array
    }

    public static void main(String[] args)          //Driver Code
    {
        int arr[]=get();                                //calling get method over array

        for (int a:arr)                                  //loop for printing array
        {
            System.out.println(a);                         //printing array  element
        }
    }
}

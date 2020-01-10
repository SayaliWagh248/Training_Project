package ArraysDemos;

public class TestArray {

    public static void main(String[] arg)
    {
        int a[]=new int[5];         //Declaring array

         a[0]=0;                                //Initializing array elements
         a[1]=1;
         a[2]=2;
         a[3]=3;
         a[4]=4;


         for (int i=0;i<=a.length-1;i++)            //loop for printing array
         {
             System.out.println(a[i]);                  //printing array elements
         }
    }
}

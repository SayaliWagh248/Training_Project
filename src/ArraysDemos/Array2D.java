package ArraysDemos;

public class Array2D

{
    public static void main(String[] args)
    {
        int a[][]={{11,22,33,44},{55,66,77,88},{99,90,80,70},{60,50,40,30}};   //Declaring & initializing 2D array

        for (int i=0;i<4;i++)                                                   //loop for rows
        {
            for(int j=0;j<4;j++)                                                //loop for column
            {
                System.out.print(a[i][j]+" ");                                  //Printing matrix
            }
            System.out.println();                                               //Printing next line
        }
    }
}

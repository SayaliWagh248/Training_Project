package ArraysDemos;

public class MatrixMultiplication {

    public static void main(String[] arg)
    {
        int a[][]={{1,2,3},{1,2,3},{1,2,3}};                    //First Array

        int b[][]={{2,2,2},{1,1,1},{3,3,3}};                    //Second Array

        int c[][]=new int[3][3];                                 //Resultant Array to store the multiplication

        for(int i=0;i<3;i++)                                     //loop for rows
        {
            for(int j=0;j<3;j++)                                    //loop for columns
            {
                c[i][j]=0;                                          //Initializing each element to zero

                for(int k=0;k<3;k++)                                //loop for multiplication
                {
                    c[i][j]=a[i][j]*b[i][j];                        //calculating product
                }
                System.out.print(c[i][j]+" ");                      //Printing the multiplied matrix
            }
            System.out.println();                                    //Printing next line
        }
    }
}

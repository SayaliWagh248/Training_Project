package ArraysDemos;

public class MatricesSum {

    public static void main(String[] arg)
    {
        int[][] p={{1,2,3},{4,5,6}};         //First array
        int[][] q={{1,2,3},{4,5,6}};         //Second array


        int[][]r=new int[2][3];                 //Resultant array

        for(int i=0;i<2;i++)                    //loop for rows
        {
            for (int j=0;j<3;j++)               //loop for columns
            {
                r[i][j]=p[i][j]+q[i][j];        //Code for Adding Matrices
                System.out.print(r[i][j]+"  "); //Printing row
            }
            System.out.println();                  //Printing Next Line
        }


    }
}

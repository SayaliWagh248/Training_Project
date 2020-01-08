package Polymorphism;

public class Addition
{

    int result=0;
    double sum=0;

    //add method to add integers only
    public int add(int... num)                                      //using VarArg i.e. method accepting variable  number of parameter.
    {
        for(int i:num)
        {
            result=result+i;
        }
        return result;
    }


    //add method to add doubled only
    public double add(double... num)
    {
        for (double d:num)
        {
            sum=sum+d;
        }
        return sum;
    }

    //add method is overloaded

}

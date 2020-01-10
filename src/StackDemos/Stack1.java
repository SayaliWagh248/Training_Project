package StackDemos;
//stack using array

public class Stack1 {

    static  final int SIZE=1000;
    int top;
    int a[]=new int[SIZE];                  //Declaring & initializing array with given size

    //Method to check is stack is empty
    boolean isEmpty()
    {
        return (top<0);
    }

    Stack1()
    {
        top=-1;
    }

    //Method to push elements into stack
  boolean push(int x)
    {
        if(top>=SIZE-1)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top]=x;
            System.out.println("Element is pushed "+x);
        }
        return  true;
    }

    //Method to pop elements from stack
    boolean pop()
    {
        if(top<0)
        {
            System.out.println("Stack Underflow");
            return false;
        }
            else {
                int x=a[top--];
                System.out.println("Element popped "+x);

        }
           return true;
    }

    //Method to peek elements from stack
    int peek()
    {
        if(top<0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x=a[top];

            return x;
        }

    }

    public static void main(String[] arg)
    {
        Stack1  s=new Stack1();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.pop();
        s.isEmpty();
    }

}

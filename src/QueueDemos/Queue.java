package QueueDemos;

import java.util.Scanner;

public class Queue

{
    public static int front,rear,capacity;
    public static int queue[];

    //Constructor to initialize class fields
    Queue(int c)
    {
        capacity=c;
        front=rear=0;
        queue=new int[capacity];
    }

    //Method to perform insertion operation
    static void queueEnqueue(int data)
    {
        if(capacity==rear)
        {
            System.out.println("Queue is full");
        }

        else
        {
           queue[rear]=data;
           rear++;
        }
    }

    //Method to perform deletion operation
    static void queueDequeue()
    {
        if(front==rear)
        {
            System.out.println("Queue is empty");
        }

        else
        {

            for (int j=0;j<rear-1;j++)
                queue[j]=queue[j+1];

            rear--;
        }
    }

    //Function to print queue elements
    static void printQueue()
    {
        if(front==rear)
        {
            System.out.println("There is no element in Queue");
        }
        else
        {
            System.out.println("\n Queue elements are:-");
            for (int i=0;i<=rear-1;i++)
            {

                System.out.print(queue[i]+" ");
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Enter the capacity of queue");
        Scanner sc=new Scanner(System.in);
        int cap=sc.nextInt();

        Queue q=new Queue(cap);

        //Accepting queue elements from user
        for(int i=0;i<cap;i++)
        {
            System.out.println("Enter the element to be inserted ");
            int data=sc.nextInt();
            queueEnqueue(data);
        }

        queueEnqueue(20);


        printQueue();

        queueDequeue();
        queueDequeue();
        System.out.println("\n\n After Deque Operation performed.........");

        printQueue();
    }
}

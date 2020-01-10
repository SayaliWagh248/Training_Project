package QueueDemos;

import java.util.Iterator;
import java.util.Scanner;

class QNode
{
    int key;
    QNode next;

    QNode(int k)
    {
        key=k;
        next=null;
    }
}



class Queue1 {
        QNode front, rear;

public Queue1()
        {
        this.front = this.rear = null;
        }

        //Method to insert elements into the Queue
        void enqueue(int key)
        {


        QNode temp = new QNode(key);

        if (this.rear == null)
        {
        this.front = this.rear = temp;
        return;
        }

        this.rear.next = temp;
        this.rear = temp;
        }

        //Method to delete elements from queue
        QNode dequeue()
        {

        if (this.front == null)
        return null;

        QNode temp = this.front;
        this.front = this.front.next;


        if (this.front == null)
        this.rear = null;
        return temp;
        }



}


public class QueueLL {
    public static void main(String[] args)
    {
        Queue1 q = new Queue1();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);



       System.out.println("Dequeued item is " + q.dequeue().key);
    }
}
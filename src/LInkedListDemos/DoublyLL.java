package LInkedListDemos;

import javax.swing.*;

public class DoublyLL {
    Node head=null;
    class Node                                            //class to construct node of LL
    {
        int data;
        Node prev;
        Node next;

        Node(int d)                                         //Constructor to initialize the class variables
        {
            this.data = d;
            prev = null;
            next = null;

            System.out.println("node Constructor called");
        }
    }

    //Node head, tail = null;

    public void addNode(int data)                            //Method to add new node into LL
    {
        Node newNode = new Node(data);                            //Creation & memory allocation of new node


        if (head == null)                                      //Checking if LL is empty
        {
            head = newNode;                                 //Assigning newly created node as very first node i.e. head
            head.next = null;
            head.prev = null;                   //Making next & prev field refer to null as only single node is in LL

        System.out.println("Head element added");
        }

        else                                                //If LL is not empty
        {
            while (head != null) {
                head = head.next;                              //Traveling LL upto the last node
            }

            head = newNode;                               //assigning new node next to last node
            newNode.prev = head;            //assigning new nodes prev link to head
            newNode.next=null;

            System.out.println("Element added");
        }
    }

    public void printList(DoublyLL dl) {
        Node current = dl.head;
        System.out.println("Traversal in forward Direction");
        while (current!= null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        System.out.println("Traversal in reverse direction");
       /* while (last != null)
        {
            System.out.print(last.data + " ");
            last = last.prev;
        }*/
    }

        public static void main(String[] args)
        {
            DoublyLL d = new DoublyLL();

            d.addNode(12);
            d.addNode(23);
            d.addNode(34);
            d.addNode(45);
            d.addNode(56);


            d.printList(d);
        }

}
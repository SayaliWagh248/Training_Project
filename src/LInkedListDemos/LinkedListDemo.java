package LInkedListDemos;

public class LinkedListDemo {

    Node head;                                              //Declaring head element;

    static class Node{                                      //class to construct LL node
        int data;
        Node next;



        Node(int d)                                          //Constructor to  initialize node's data & next field
        {
            data=d;
            next=null;
        }
    }

    public static LinkedListDemo insert(LinkedListDemo l,int data)          //Method definition to insert element into LL
    {
        Node new_node=new Node(data);                                   //Creation & memory allocation for new node
        new_node.next=null;

        //inserting first node i.e. head node in LL
        if(l.head==null)
            l.head=new_node;

        //head is present
        else {
            Node last = l.head;                                     //Initializing last variable to the head node
            while (last.next != null)                                 //Iterating to find last element of LL
            {
                last = last.next;
            }
            last.next = new_node;                                    //Inserting new node to the next of last element
        }
        return  l;
    }

    //Method to print the LL
    public static void printList(LinkedListDemo l)
    {
        Node current_node=l.head;                                       //Assigning temp node to head node

        System.out.println("Linked List:- ");
        while (current_node!=null)
        {
            System.out.print(current_node.data+" ");                    //Printing data of each node in LL

            current_node=current_node.next;                             //Changing temp node with next node
        }

    }

    public static void main(String[]  arg)                              //Driver code
    {
        LinkedListDemo l=new LinkedListDemo();                          //Object creation & memory Allocation

        l=insert(l,10);                                             //Calling insert method
        l=insert(l,20);
        l=insert(l,30);
        l=insert(l,40);
        l=insert(l,50);

        printList(l);                                                       //Calling print method

    }

}

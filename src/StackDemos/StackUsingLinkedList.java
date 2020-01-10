package StackDemos;

public class StackUsingLinkedList {

                                                                // A linked list node
    private class Node {

        int data;
        Node link;
    }
    // create global top reference variable
    Node top;

    // Constructor
    StackUsingLinkedList()
    {
        this.top = null;
    }

    // Method to add an element x in the stack
    public void push(int x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();

        // check if stack (heap) is full. Then inserting an element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }

    //Method to check if the stack is empty or not
    public boolean isEmpty()
    {
        return top == null;
    }

    //Method to return top element in a stack
    public int peek()
    {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }

    //Method to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check if stack underflow
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).link;
    }

    public void display()
    {
        // check if the  stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
        }
        else {
            Node temp = top;
            while (temp != null) {

                // print node data
                System.out.printf("%d->", temp.data);

                // assign temp link to temp
                temp = temp.link;
            }
        }
    }

    public static void main(String[] args)
    {

        StackUsingLinkedList obj = new StackUsingLinkedList();
        // insert Stack value
        obj.push(11);
        obj.push(22);
        obj.push(33);
        obj.push(44);

       //calling print method
        obj.display();

       //Printing the top element of stack
        System.out.printf("\nTop element is %d\n", obj.peek());

        // Delete top element of Stack
        obj.pop();
        obj.pop();

        // print Stack elements
        obj.display();

        // print Top element of Stack
        System.out.printf("\n Top element is %d \n", obj.peek());
    }
}

package LInkedListDemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args)
    {
        LinkedList<String> linkedList=new LinkedList<String>();             //Creation & memory allocation for LL

        //-----------------------------------Inserting elements into LinkedList----------------------------------------------------
        linkedList.add("ABC");
        linkedList.add("DEF");                      //add method to insert elements into LL
        linkedList.add("GHI");
        linkedList.add("JKL");


        linkedList.addFirst("MNO");                //Method to insert element at the first index of LL
        linkedList.addLast("PQR");                  //Method to insert element at the last index of LL

        linkedList.add(2,"SUV");           //Method to insert element at specific location  of LL


        //---------------------------------Iterating over LinkedList for printing data----------------------------------------------------
        Iterator<String> it=linkedList.iterator();
        while (it.hasNext())                        //calling hasNext method to check if LL has more elements
        {
            System.out.println(it.next());              //Printing LL's Elements
        }

        //-------------------------------------Removing element from Linked  List---------------------------------------------

        linkedList.remove(5);               //Removing particular element from LL
        linkedList.removeFirst();                   //Removing first element from LL
        linkedList.removeLast();                    //Removing last element from LL

        System.out.println("\n \n After removing some elements");

        //---------------------------------Iterating over LinkedList for printing data----------------------------------------------------

        Iterator<String> it1=linkedList.iterator();

        while (it1.hasNext())                           //calling hasNext method to check if LL has more elements
        {
            System.out.println(it1.next());
        }
    }
}

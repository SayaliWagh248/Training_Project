package CompositionDemo;

import java.util.ArrayList;
import java.util.List;

public class CompositionTest

{
    public static void main(String[] arg)
    {
        Book b1=new Book("Unposted Letters","Ravindraji Tagore");
        Book b2=new Book("Three Thousand Stiches","Sudha Murti");
        Book b3=new Book("Shyam chi Aai","Sane Guruji");
        Book b4=new Book("AmarutVel","V.s.Khandekar");

        List<Book> bookList=new ArrayList<Book>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        bookList.add(b4);

        Library library=new Library(bookList);

        List<Book>bks=library.getTotalNumOfBooksInLibrary();

        int count=0;
        for (Book b:bks)
        {

            System.out.println(++count +") "+"Book name is: "+b.title+" & the author of the book is: "+b.author);
        }
    }
}

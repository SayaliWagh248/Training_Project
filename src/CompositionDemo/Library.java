package CompositionDemo;

import java.util.List;

public class Library

{
    private final List<Book> bookList;

    //Constructor
    public Library(List<Book> bookList)
    {
        this.bookList=bookList;
    }

    public List getTotalNumOfBooksInLibrary()
    {
        return bookList;
    }
}

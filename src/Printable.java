public interface Printable {

public void  print();

 default void show()
 {
     System.out.println("Inside Showing Method");
 }
}

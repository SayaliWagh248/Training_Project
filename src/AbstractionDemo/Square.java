package AbstractionDemo;

//Sub class extending abstract class & implementing Interface
public class Square extends Shape implements Countable

{
    //local variable
    double side;

    //parameterized constructor
    public Square(String color,double side)
    {
        super(color);
        this.side=side;

    }

    //Overridden Method
    @Override
    public double area() {
        return side*side;
    }

    //Overridden Method
    @Override
    public String toString() {
        return "The color of Square is "+color+" & the area of color is "+area();
    }
}

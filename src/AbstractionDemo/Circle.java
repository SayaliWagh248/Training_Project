package AbstractionDemo;

//sub class overriding abstract class Shape
public class Circle extends Shape implements Countable
{
    //local variable
    double radius;

    //Parameterized Constructor
    public Circle(String color,Double radius) {
        super(color);
        this.radius=radius;
    }

    //Overridden method from shape class
    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    //Overridden method from shape class
    @Override
    public String toString() {
        return "The color of Circle is "+ color+" & the area of the Circle is "+area();
    }
}



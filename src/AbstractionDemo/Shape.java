package AbstractionDemo;

//Abstract class acting as a parent
public abstract class Shape

{
    //local variable
    public String color;


    //abstract method declaration
    abstract public String toString();

    //Constructor with one parameter
    public Shape(String color)
    {
        System.out.println("Shape Constructor is called");
        this.color=color;
    }

    //Concrete method i.e. method with implementation body
    public String getColor()
    {
        return color;
    }
}

package InheritanceDemo;

class Java5Version
{
    public  Java5Version()
    {
        System.out.println("Supports- ");
         System.out.println("\n  Generics, Annotations, VarArgs, Enhanced for loop");
    }
}

class Java6Version extends Java5Version
{
    public Java6Version()
    {
        super();
        System.out.println("\n Scripting language support & pluggable annotation");
    }
}

class Java7Version extends Java6Version
{
    public Java7Version()
    {
        super();
        System.out.println("\n Switch on string, diamond operator");
    }
}

class  Java8Version extends Java7Version
{
    public Java8Version()
    {
        super();
        System.out.println("\n Lambda Expression, Default methods, parallelSort, String Joiner");
    }
}

public class MultilevelInheritance

{
        public static void main(String[] args)
        {
            Java8Version jdk8=new Java8Version();
        }
}

package InnerClasses;

class StaticNested {
    private static void outerMethod()
    {
        System.out.println("Inside outer class method");
    }

    static class SInner
    {

        public static void main(String[] arg)
        {
            System.out.println("Inside Inner class's method");
            outerMethod();
        }
    }
}

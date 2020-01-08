package EncapsultionData;

public class OnlineShopping

{
    public static void main(String[] args)
    {
        ProductReadOnly pr=new ProductReadOnly();

        System.out.println("\n The product code is: "+  pr.getpCode());
        System.out.println("\n The product name is: "+  pr.getpName());
        System.out.println("\n The product details are: "+   pr.getpDetails());
        System.out.println("\n The product details are: "+   pr.getpPrice());

    }

}

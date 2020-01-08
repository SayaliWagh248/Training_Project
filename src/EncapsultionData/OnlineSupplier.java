package EncapsultionData;

public class OnlineSupplier

{
    public static void main(String[] args)
    {
        PoductWriteOnly pw=new PoductWriteOnly();


        pw.setpCode(103);


        pw.setpName("Dairy Milk");


        pw.setpDetails("Chocolate");


        pw.setpPrice(100.50);

        System.out.println("Data Added successfully");
    }




}

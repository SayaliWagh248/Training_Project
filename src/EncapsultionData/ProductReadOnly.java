package EncapsultionData;

public class ProductReadOnly

{
    private int pCode;
    private String pName;
    private  double pPrice;
    private  String pDetails;

    ProductReadOnly()
    {
        pCode=101;
        pName="Good Day";
        pPrice=30.0;
        pDetails="Biscuit";
    }

    public int getpCode() {
        return pCode;
    }

    public String getpName() {
        return pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public String getpDetails() {
        return pDetails;
    }
}

package StringDemos;

public final class ImmutableClass

{
    private final int var1;

    private final String var2;

    private final float var3;

    private ImmutableClass(int var1, String var2,float var3)
    {
        this.var1=var1;
        this.var2=var2;
        this.var3=var3;
    }

    public static ImmutableClass createNewInstance(int fld1,String fld2, float fld3)
    {
        return new ImmutableClass(fld1, fld2, fld3);
    }

    public int getVar1() {
        return var1;
    }

    public String getVar2() {
        return var2;
    }

    public float getVar3() {
        return var3;
    }
}

class TestImmutable
{
    public static void main(String[] ar)
    {
        ImmutableClass ic=ImmutableClass.createNewInstance(12,"QWERTY",34.5f);

        System.out.println(ic.getVar1());
        System.out.println(ic.getVar2());
        System.out.println(ic.getVar3());

    }
}

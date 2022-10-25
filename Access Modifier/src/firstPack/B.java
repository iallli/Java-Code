package firstPack;

public class B
{
    int defaultVarB;
    private int privateVarB;
    public int publicVarB;
    protected int protectedVarB;

    void displayDefaultB()
    {
        A a = new A();
        a.defaultVarA = 5;
        a.displayDefaultA();

        //a.privateVarA=1000;
        //a.displayPrivateA();

        a.publicVarA=100;
        a.displayPublicA();
        a.protectedVarA=1;
        a.displayProtectedA();
        protectedVarB = 1;
    }
    private void displayPrivateB()
    {
    }
    public void displayPublicB()
    {
    }
    protected void displayProtectedB()
    {
    }
}

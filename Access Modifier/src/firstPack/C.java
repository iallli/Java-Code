package firstPack;

public class C extends B
{
    void displayC()
    {
        B b = new B();
        b.defaultVarB = 100;
        b.displayDefaultB();

        //b.privateVarB=9;
        //b.displayPrivateB();

        b.publicVarB=5;
        b.displayPublicB();
        protectedVarB=1;
        displayProtectedB();

        A a = new A();
        a.publicVarA=9;
        a.displayPublicA();
        a.protectedVarA=2;
        a.displayProtectedA();
    }

}

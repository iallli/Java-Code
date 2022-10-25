package secondPack;

import firstPack.B;
import firstPack.A;

public class D extends B
{
    A a = new A();//cannot access A members.
    B b = new B();//cannot access B members even if there is INHERITANCE
    void displayD()
    {
        a.publicVarA=0;
        a.displayPublicA();

        //a.protectedVarA=3;
        //a.displayProtectedA();

        b.publicVarB=0;
        b.displayPublicB();
        protectedVarB=9;
        displayProtectedB();
    }
}

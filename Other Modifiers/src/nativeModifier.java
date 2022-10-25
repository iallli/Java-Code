class nativeModifier
{
    static
    {
        System.loadLibrary("");
    }
    native void m();
}
class Test
{
    public static void main(String[] args) {
        nativeModifier nm = new nativeModifier();
        nm.m();
    }
}

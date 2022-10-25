public class NestedDemo
{
    private int a;
    int b;
    static int c;
    class nestedClass1
    {
        public void m1()
        {
            System.out.println("M1"+a);
            System.out.println("M1"+b);

        }
    }
    static class nestedClass2
    {
        public void m2()
        {
            System.out.println("M2"+c);
        }
    }


}
class Main
{
    public static void main(String[] args)
    {
        NestedDemo nd = new NestedDemo();
        NestedDemo.nestedClass1 nc1 = nd.new nestedClass1();
        NestedDemo.nestedClass2 nc2 = new NestedDemo.nestedClass2();
        nc1.m1();
        nc2.m2();
    }
}
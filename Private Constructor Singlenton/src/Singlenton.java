public class Singlenton
{
    static Singlenton instance = null;
    public int x =10;
    private Singlenton() {}

    public static Singlenton getInstance()
    {
        if (instance == null)
            instance = new Singlenton();
        return instance;
    }
}
    class Main
    {
        public static void main(String[] args)
        {
            Singlenton sing = Singlenton.getInstance();//new Singlenton() is not allowed when you have a private constructor.
            Singlenton sing1 = Singlenton.getInstance();//new Singlenton() is not allowed when you have a private constructor.
            sing.x = sing.x+10;
            System.out.println(sing.x);
            System.out.println(sing1.x);
        }
    }
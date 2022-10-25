public class ThrowKeyword
{
    //"throw" is used to raise an exception explicitly
    public static void main(String[] args)
    {
//        ArithmeticException ae = new ArithmeticException("XYZ");
//        throw ae;
//        Rule 1 = Exception object should not be null,  it should be initialized with the exception that you want to throw.

        throw new NullPointerException("ABC");
//        Rule 2 = you cannot write any statement after throw.
//        Rule 3 = whenever you are using throw with any object, that object should be a subclass/child of throwable class ("throw ae")
    }
}

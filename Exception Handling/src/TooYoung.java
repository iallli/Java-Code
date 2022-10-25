public class TooYoung extends RuntimeException
{
    public TooYoung(String s)
    {
        //Super keyword is used in inheritance
        //Whenever you want to pass something to the constructor of the parent class we use super method.
        super(s);
    }

}

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsKeyword
{
    //Rule 1 = throws keyword cannot be used with classes.
    //Rule 2 = throws keyword is always used with java.lang.throwable class
    //Rule 3 = we can write multiple exceptions using throws keyword.
    //Rule 4 = throws keyword is used with CHECKED_Exceptions.

    public static void main(String[] args)throws FileNotFoundException,ArithmeticException,NullPointerException
    {
        PrintWriter pw = new PrintWriter("abc.txt");
//        try {
//            PrintWriter pw = new PrintWriter("abc.txt");//Checked Exception
//        }catch (FileNotFoundException e){
//
//        }
        ThrowsKeyword tk = new ThrowsKeyword();
        tk.doOneThing();
    }
    void doOneThing() throws FileNotFoundException {doOneMoreThing();}
    void doOneMoreThing() throws FileNotFoundException
    {PrintWriter pw = new PrintWriter("abc.txt");}
}

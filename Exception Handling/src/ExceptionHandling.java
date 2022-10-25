public class ExceptionHandling
{
    //Providing an alternative way to handle an event.
    //Stack=>LIFO, each entry in the stack is called "Stack Frame/Activation Record"
    //Program Control(PC)
    //Default Exception Handling
    //Exception Object has 3 Attributes Name of exception, Description of exception, Location of exception(Stack Trace).
    //Checked(fully checked and partially checked) and Unchecked Exception
    //Try and Catch statements
    //Methods to print Exception Information
    //Multiple catch statements
    //Final, Finally, Finalize

    void A()
    {
        B();
    }
    void B()
    {
        try
        {
            System.out.println(5 / 0);//Unchecked Exception
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Hello");
    }

    public static void main(String[] args)
    {
        ExceptionHandling ex = new ExceptionHandling();
        ex.A();
        //PrintWriter pw = new PrintWriter("abc.txt");//Checked Exception

        try
        {
            System.out.println("Statement 1");
            System.out.println(10/0);
            System.out.println("Statement 3");
        }
        catch (Exception e1)
        {
            System.out.println(e1.toString());
        }

        String ptr = null;
        try
        {
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(Exception e2)
        {
            System.out.println(e2.getMessage());
        }
    }
}
public class tryCatchFinally
{
    public static void main(String[] args)
    {
        String ptr = null;
        try{
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Outsider");
        //Any statement that is outside the try block and generates exception causes Abnormal Termination.
    }
}

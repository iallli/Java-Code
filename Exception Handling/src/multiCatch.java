public class multiCatch
{
    public static void main(String[] args)
    {
        //When using multiple catch statements ORDER plays an important role
        try
        {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e1) {
            System.out.println(e1.getMessage());
        } catch (Exception e2) {
            System.out.println(e2.getMessage());
        }
    }
}
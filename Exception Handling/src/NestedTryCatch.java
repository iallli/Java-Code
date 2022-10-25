public class NestedTryCatch
{
    public static void main(String[] args)
    {
        try
        {
            //Statement 1
            try
            {
                //Statement 2
            }
            catch (Exception e)
            {
                //Statement 3
                try
                {
                    //Statement 4
                }
                catch (Exception e1)
                {
                    //Statement 5
                }
            }
        }
        catch (Exception e)
        {
            //Statement 6
        }
        finally
        {
            //Statement 7
            try
            {
                //Statement 8
            }
            catch (Exception e)
            {
                //Statement 9
            }
        }
        //Statement 10
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class Challenge
{
    public static void main(String[] args)
    {
        ArrayList<String> math = new ArrayList<String>();
        math.addAll(Arrays.asList(new String[]{"Raj","Tom","Ravi","Tanvi","Vikas"}));

        ArrayList<String> science = new ArrayList<String>();
        science.addAll(Arrays.asList(new String[]{"John","Ravi","Abhi","Vikas","Fisal"}));

        for(int i=0; i<math.size(); i++)
        {
            for (int j=0; j<science.size(); j++)
            {
                if(math.get(i) == science.get(j))
                {
                    System.out.println(math.get(i));
                }
            }
        }

    }
}

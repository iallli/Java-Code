import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Arrays;


public class Main
{
    public static void main(String[] args)
    {
        Set<String> ls = new LinkedHashSet<>(Arrays.asList(new String[]{"A","B","Ind","D","Ir","P"}));
        Set<String> temp = new LinkedHashSet<>();
        System.out.println(ls);

        for (String s:ls)
        {
            if(!(s.equals("P")))
            {
                temp.add(s);
            }
        }
        System.out.println(temp);
        int count=0;
        for (String s:ls)
        {
            if (s.charAt(0)=='I')
            {
                count++;
            }
        }
        System.out.println(count);
    }

}
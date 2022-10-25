import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Challenge {
    public static void main(String[] args)
    {
        List<String> n9 = new LinkedList<>(Arrays.asList(new String[]{"J", "M", "R", "T", "V"}));
        List<String> n10 = new LinkedList<>(Arrays.asList(new String[]{"J", "M", "R", "T", "P"}));
        List<String> nr =tour(n9,n10);
        System.out.println(nr);
    }

    private static List<String> tour(List<String> a, List<String> b)
    {
        List<String> n =a;
        for (String s:b)
        {
            if(!a.contains(s))
            {
                n.add(s);
            }
        }
        return n;
    }

}

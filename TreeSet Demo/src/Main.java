import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Set<String> s = new TreeSet<>(Arrays.asList(new String[]{"D","A","B","C"}));
        System.out.println(s);
    }
}
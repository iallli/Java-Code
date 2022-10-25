import java.util.Arrays;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        HashSet<String> s1 = new HashSet<>(Arrays.asList(new String[]{"A","B","C","D"}));
        HashSet<String> s2 = new HashSet<>(Arrays.asList(new String[]{"A","E","F","G"}));
        HashSet<String> s3 = new HashSet<>(Arrays.asList(new String[]{"A","H","I","J"}));

        s3.retainAll(s1);
        s3.retainAll(s2);
        System.out.println(s3);

    }
}
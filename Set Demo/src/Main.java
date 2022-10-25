import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class Main
{
    public static void main(String[] args)
    {
        Set<String> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(new String[]{"A","B","C"}));

        Set<String> s2 = new HashSet<>();
        s2.addAll(Arrays.asList(new String[]{"C","D"}));

        System.out.println(s1);
        System.out.println(s2);

        Set<String> s3 = new HashSet<>(s1);
        s3.addAll(s2);
        System.out.println("Union = "+s3);

        Set<String> s4 = new HashSet<>(s1);
        s4.retainAll(s2);
        System.out.println("Intersection = "+s4);
    }
}
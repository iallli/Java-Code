import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(3,"D");//Duplicate keys are not allowed.

        System.out.println(map);
        for (Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" = "+m.getValue());
        }
    }
}
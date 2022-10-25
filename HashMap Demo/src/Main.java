import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main(String[] args)
    {
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"A");
        hm.put(2,"B");
        hm.put(3,"C");
        hm.put(4,"C");

//        hm.put(5,null);
//        hm.put(null,"C");
//        hm.put(null,null);

        System.out.println(hm);
        for (Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" = "+m.getValue());
        }

        String str = "aaabbccdddeeeee";
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i< str.length();i++)
        {
        if(map.containsKey(str.charAt(i)))
        {
            Integer val = map.get(str.charAt(i));
            val++;
            map.replace(str.charAt(i),val);
        }
        else
        {
            map.put(str.charAt(i),1);
        }
        }
        for (Map.Entry m:map.entrySet())
        {
            System.out.println(m.getKey()+" = "+m.getValue());
        }
        for (Map.Entry m:map.entrySet())
        {
            Integer f = (Integer) m.getValue();
            Character k = (Character) m.getKey();
            if(f%2==0)
            {
                str=str.replaceAll(String.valueOf(k),"");
            }
        }
        System.out.println("Result = "+str);


    }
    }

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo
{
    public static void main(String[] args)
    {
        //
        LinkedList<String> ll = new LinkedList<>();

        //
        HashSet<String> names = new HashSet<>();
        names.add("Ned");
        names.add("Katelyn");
        LinkedList<String> lll = new LinkedList<>(names);
        for (String s :lll)
        {
            System.out.println(s);
        }

        //What is Queue=FIFO
        //Implement Queue using Linked List.
        List<Integer> l1 = new LinkedList<Integer>();
        l1 = INSERT(l1,1);
        l1 = INSERT(l1,2);
        l1 = INSERT(l1,3);
        System.out.println(l1);
        l1=REMOVE(l1);
        System.out.println(l1);
        System.out.println(SHOW(l1));
    }
    private static List<Integer> INSERT(List<Integer> a, Integer x)
    {
        a.add(x);
        return a;
    }
    private static List<Integer> REMOVE(List<Integer> a)
    {
        a.remove(0);
        return a;
    }
    private static Integer SHOW(List<Integer> a)
    {
        return a.get(0);
    }
}
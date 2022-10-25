import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo
{
    public static void main(String[] args)
    {

        //Generic Array List with default size = 10.
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(0,1);
        arrayList1.add(1,"Ali");
        arrayList1.add(2,3.3);
        for (Object o:arrayList1)
        {
            System.out.println(o);
        }
        System.out.println(arrayList1);




        //Array List with size.
        ArrayList<String> arrayList2 = new ArrayList<>(5);
        arrayList2.add(0,"A");
        arrayList2.add(1,"B");
        arrayList2.add(2,"C");
        arrayList2.add(3,"D");
        arrayList2.add(4,"E");
        arrayList2.add(0,"F");
        for (String s:arrayList2)
        {
            System.out.println(s);
        }
        System.out.println(arrayList2);
        System.out.println(arrayList2.size());




        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(4);
        arrayList3.add(5);
        for (Integer i :arrayList3)
        {
            System.out.println(i);
        }
        System.out.println(arrayList3);




        HashSet<String> names = new HashSet<>();
        names.add("Ned");
        names.add("Katelyn");
        ArrayList<String> arrayList = new ArrayList<>(names);
        for (String s :arrayList)
        {
            System.out.println(s);
        }




        arrayList1.clear();
        arrayList2.clear();
        arrayList3.clear();
        arrayList.clear();
        System.out.println(arrayList1);
        System.out.println(arrayList2);
        System.out.println(arrayList3);
        System.out.println(arrayList);
    }
}
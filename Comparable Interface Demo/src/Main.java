import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    //Used to define default sorting logic for custom define classes

    public static void main(String[] args)
    {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(100);
        a.add(60);
        a.add(50);
        a.add(10);
        Collections.sort(a);
        System.out.println(a);

        Student s1 = new Student(10,"A");
        Student s2 = new Student(2,"Z");
        Student s3 = new Student(1,"V");
        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        Collections.sort(arr);
        for (Student s:arr) {
            System.out.println(s.getRollNo()+"="+s.getName());
        }
    }
}
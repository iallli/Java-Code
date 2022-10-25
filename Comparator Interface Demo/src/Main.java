import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    //Used to define different sorting logic for different properties
    public static void main(String[] args) {

        Student s1 = new Student(200, "A", 100);
        Student s2 = new Student(101, "Z", 600);
        Student s3 = new Student(108, "H", 900);
        Student s4 = new Student(110, "Y", 280);
        Student s5 = new Student(401, "G", 240);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        arr.add(s5);

        Collections.sort(arr);
        System.out.println("Roll No.");
        for (Student s : arr)
        {
            System.out.println(s.getRollNo() + "=" + s.getName());
        }

        Collections.sort(arr, new MarksComparator());
        System.out.println("Marks.");
        for (Student ss : arr)
        {
            System.out.println(ss.getRollNo() + "=" + ss.getName() + "=" + ss.getMarks());
        }
    }
}
class MarksComparator implements Comparator
{
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student) o1;
        Student s2 = (Student) o2;
        if(s1.getMarks() > s2.getMarks())
            return -1;
        else
            return 1;
    }
}
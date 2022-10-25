import java.util.ArrayList;

public class School
{
    public static void main(String[] args)
    {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setRollNo(1);
        s1.setName("Ali");

        s2.setRollNo(2);
        s2.setName("Ahmad");

        s3.setRollNo(3);
        s3.setName("Fareed");

        studentArrayList.add(0,s1);
        studentArrayList.add(1,s2);
        studentArrayList.add(2,s3);
        for (Student s:studentArrayList)
        {
            System.out.println(s.getRollNo()+" = "+s.getName());
        }

        studentArrayList.remove(0);
        Student s4 = new Student();
        s4.setRollNo(1);
        s4.setName("Muhammad");
        studentArrayList.add(0,s4);
        for (Student s:studentArrayList)
        {
            System.out.println(s.getRollNo()+" = "+s.getName());
        }

        studentArrayList.clear();
    }
}

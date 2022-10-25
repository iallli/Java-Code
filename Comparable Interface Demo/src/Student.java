import java.lang.Comparable;
public class Student implements Comparable
{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        if(this.rollNo>s.rollNo)
        {
            return 1;
        } else if (this.rollNo==s.rollNo) {
            return 0;
        }
        else
            return -1;
    }
}

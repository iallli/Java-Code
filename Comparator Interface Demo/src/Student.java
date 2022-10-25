import java.lang.Comparable;

public class Student implements Comparable
{
    int rollNo;
    String name;
    int marks;

    public Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student)o;
        if(this.rollNo>s.rollNo)
            return 1;
        else if(this.rollNo==s.rollNo)
            return 0;
        else
            return -1;
    }
}
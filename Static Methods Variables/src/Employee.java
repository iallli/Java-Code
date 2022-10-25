import com.sun.security.jgss.GSSUtil;

public class Employee {
    int id;
    int salary;
    static int count;
    static {
        count=0;
        System.out.println("Static Block.");
    }

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
        count++;
    }

    public static void display() {
        System.out.println("Hello Static.");
    }

    public void display1() {
        System.out.println("Hello Public." + id + "=" + salary);

    }
}
class MainClass{
    public static void main(String[] args) {
        Employee emp = new Employee(1,10);
        Employee emp1 = new Employee(2,100);
        Employee emp2 = new Employee(3,1000);
        System.out.println(Employee.count);
        Employee.display();
        emp.display1();
        emp1.display1();
        emp2.display1();
        A.display(9999);//Overloading
        A.display();//Method Hiding
        System.out.println(A.count);

    }
}

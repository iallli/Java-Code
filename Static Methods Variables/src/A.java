public class A extends Employee
{
    public A(int id, int salary)
    {
        super(id, salary);
    }
    public static void display() {
        System.out.println("Hello Static from Child.");
    }
    public static void display(int a) {
        System.out.println("Hello Static from Child."+a);
    }

}

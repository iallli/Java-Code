class Animal
{
    public void walk()
    {
        System.out.println("Walking.");
    }
}
class Dog extends Animal
{
    public void bark()
    {
        System.out.println("Barking.");
    }
}

///////////////////////////////////////////////////////
class A
{
    public void display()
    {
        System.out.println("Hello from Parent.");
    }
}
class polymorphism extends A
{

    public polymorphism()
    {
        System.out.println("Constructor Overloading.");
    }
    public polymorphism(int i)
    {
        super();
        System.out.println("Constructor Overloading.");
        System.out.println(i);
    }
    public polymorphism(int i, int i1)
    {
        super();
        System.out.println("Constructor Overloading.");
        System.out.println(i);
        System.out.println(i1);
    }

    public void M1()
    {
        System.out.println("Method Overloading.");
    }
    public void M1(int x)
    {
        System.out.println("Method Overloading.");
        System.out.println(x);
    }
    public void M1(int x, int y)
    {
        System.out.println("Method Overloading.");
        System.out.println(x);
        System.out.println(y);
    }

    public void display()
    {
        System.out.println("Hello from Child.");
    }

}

///////////////////////////////////////////////////////

abstract class car
{
    int door;
    int tyres;
    String color;
    //Abstract Methods
    abstract void accelerate();
    abstract void applyBreaks();
}

class CarRepair
{
    void repairCar(car car1)
    {
        car1.accelerate();
        car1.applyBreaks();
    }
}

class Fararie extends car
{
    void accelerate() {
        System.out.println("Accelerate Fararie.");
    }
    void applyBreaks() {
        System.out.println("Apply Breaks Fararie.");
    }
}
class Audi extends car
{
    void accelerate() {
        System.out.println("Accelerate Audi.");
    }
    void applyBreaks() {
        System.out.println("Apply Breaks Audi");
    }
}
class Tesla extends car
{
    void accelerate() {System.out.println("Tesla Accelerate.");}
    void applyBreaks() {System.out.println("Apply Breaks Tesla.");}
}

///////////////////////////////////////////////////////

class AAA
{
    private int var=1000;
    public int getVar()
    {
        return  var;
    }
    public void setVar(int x)
    {
        if(x>1000)
            this.var=0;
        else
            this.var=x;
    }
}

///////////////////////////////////////////////////////

public class OOPS
{
    public String model;
    public String color;
    public int seats;

    public void display()
    {
        System.out.println(model);
        System.out.println(color);
        System.out.println(seats);
    }
    //      Default Constructor
    public OOPS()
    {
        System.out.println("Default Constructor.");
        model="Default Model.";
        color="Default Color.";
        seats=5;
    }
    //      Constructor with arguments
    public OOPS(String m, String c, int s)
    {
        System.out.println("Constructor with Arguments.");
        this.model=m;
        this.color=c;
        this.seats=s;
    }

    public static void main(String[] args)
    {
        OOPS obj;//Object Declaration.
        obj = new OOPS();//Memory Allocation.
        //      Setting values in variables
        obj.model="ABC";
        obj.color="XYZ";
        obj.seats=2;
        obj.display();

        OOPS Toyota = new OOPS();//Default Constructor is called.
        Toyota.display();

        OOPS Honda = new OOPS("A","B",5);//Constructor with arguments is called.
        Honda.display();

        //Inheritance
        Dog d1 = new Dog();
        d1.bark();
        d1.walk();

        //Constructor Overloading.
        polymorphism p1=new polymorphism();//Constructor Overloading. Default Constructor with no parameters is called.
        polymorphism p2=new polymorphism(5);//Constructor with one parameter is called.
        polymorphism p3=new polymorphism(5,10);//Constructor with 2 parameters is called.

        //Method Overloading.
        p1.M1();
        p1.M1(5);    //Compiler time Polymorphism/Static Binding/Early Binding.
        p1.M1(5,10);

        //Method Overriding.
        System.out.println("Method Overriding.");
        polymorphism p4=new polymorphism();
        p4.display();

        //Operator Overloading.
        System.out.println("Operator Overloading.");
        int as=10;
        int bs=10;
        System.out.println(as+bs);
        System.out.println("AS = "+as);
        System.out.println("AS+BS = "+(as+bs));

        //Abstraction.
        car c1 = new Fararie();
        CarRepair cr1 = new CarRepair();
        cr1.repairCar(c1);

        car c2 = new Audi();
        CarRepair cr2 = new CarRepair();
        cr2.repairCar(c2);

        car c3 = new Tesla();
        CarRepair cr3 = new CarRepair();
        cr3.repairCar(c3);

        //Encapsulation.
        AAA a1=new AAA();
        System.out.println(a1.getVar());
        a1.setVar(999);
        System.out.println(a1.getVar());
        
        
        A a2 = new A();
        a2.display();

    }
}

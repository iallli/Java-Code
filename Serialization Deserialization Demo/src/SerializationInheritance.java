import java.io.*;
class A implements Serializable
{
    String name;
    String color;

    public A(String name, String color) {
        this.name = name;
        this.color = color;
    }
}

class B extends A
{
    int wheel;

    public B(String name, String color, int wheel) {
        super(name, color);
        this.wheel = wheel;
    }
}


class C
{
    String n;
    String c;

    public C() {
    }

    public C(String n, String c) {
        this.n = n;
        this.c = c;
    }
}

class D extends C implements Serializable
{
    int w;

    public D(String n, String c, int w) {
        super(n, c);
        this.w = w;
    }
}


public class SerializationInheritance
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {

        B b = new B("A","Red",4);
        //
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("temp.txt"));
        objectOutputStream.writeObject(b);

        //
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("temp.txt"));
        B c2 = (B) objectInputStream.readObject();

        System.out.println(c2.name);
        System.out.println(c2.color);
        System.out.println(c2.wheel);



        D d = new D("B","Blue",5);
        //
        ObjectOutputStream objectOutputStream1 = new ObjectOutputStream(new FileOutputStream("file.txt"));
        objectOutputStream1.writeObject(d);

        //
        ObjectInputStream objectInputStream1 = new ObjectInputStream(new FileInputStream("file.txt"));
        D d1 = (D) objectInputStream1.readObject();

        System.out.println();
        System.out.println(d1.n);//Default value
        System.out.println(d1.c);
        System.out.println(d1.w);

    }
}

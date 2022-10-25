import java.io.*;

class Car implements Serializable{
    String name;
    transient String color;
    transient int price;//Information Loss

    public Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }
}

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car c1 = new Car("F","Red",100);

//        Serialization
        //FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        objectOutputStream.writeObject(c1);

//        Deserialization
        //FileInputStream fileInputStream = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.txt"));
        Car c2 = (Car) objectInputStream.readObject();

        System.out.println(c2.name);
        System.out.println(c2.color);
        System.out.println(c2.price);

    }
}
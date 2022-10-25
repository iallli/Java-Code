import java.io.*;

class CarCustom implements Serializable
{
    String name;
    transient String color;

    public CarCustom(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    private void writeObject(ObjectOutputStream objectOutputStream)throws IOException
    {
        objectOutputStream.defaultWriteObject();
        String colorTemp = "aa"+color;
        objectOutputStream.writeObject(colorTemp);
    }
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException
    {
        objectInputStream.defaultReadObject();
        String colorTemp = (String) objectInputStream.readObject();
        color = colorTemp.substring(2);
    }
}

public class CustomSerialization
{
    public static void main(String[] args)throws IOException, ClassNotFoundException
    {
        CarCustom c1 = new CarCustom("A","Blue");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("xyz.txt"));
        objectOutputStream.writeObject(c1);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("xyz.txt"));
        CarCustom c2 = (CarCustom) objectInputStream.readObject();

        System.out.println(c2.name);
        System.out.println(c2.color);


    }
}

import java.io.*;

class CarExternal implements Externalizable
{
    String name;
    String color;

    public CarExternal() {
    }

    public CarExternal(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    @Override
    //Serialization
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeObject(name);
        out.writeObject(color);
    }

    @Override
    //Deserialization
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        name = (String) in.readObject();
        color = (String) in.readObject();
    }
}
public class Externalization
{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
     CarExternal c1 = new CarExternal("A","Yellow");

     ObjectOutputStream objectOutputStream =
             new ObjectOutputStream(new FileOutputStream("klm.txt"));
     objectOutputStream.writeObject(c1);


     ObjectInputStream objectInputStream =
             new ObjectInputStream(new FileInputStream("klm.txt"));
     CarExternal c2 = (CarExternal) objectInputStream.readObject();

     System.out.println(c2.name);
     System.out.println(c2.color);

    }
}

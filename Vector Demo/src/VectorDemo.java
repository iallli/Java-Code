import java.util.List;
import java.util.Vector;

public class VectorDemo
{
    public static void main(String[] args)
    {
        Vector v = new Vector();
        Vector v1 = new Vector(5);
        Vector v2 = new Vector(5,10);

        List<Animal> zoo = new Vector<Animal>();

        Animal a = new Animal("T",'c');
        zoo.add(a);

        Animal b = new Animal("L",'c');
        zoo.add(b);

        Animal c = new Animal("C",'h');
        zoo.add(c);

        Animal d = new Animal("H",'h');
        zoo.add(d);

        List<Animal> herb = new Vector<Animal>();
        List<Animal> carn = new Vector<Animal>();

        for (Animal animal:zoo)
        {
            boolean b1 = filter(animal);
            if(b1)
            {
                carn.add(animal);
            }
            else
                herb.add(animal);
        }

        for (Animal a1:carn)
        {
            System.out.println(a1.getName());
        }
        for (Animal a2:herb)
        {
            System.out.println(a2.getName());
        }

    }
    private static boolean filter(Animal a)
    {
        if(a.getType()=='c')
            return true;
        else
            return false;
    }
}
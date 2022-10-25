public class FinalVariables
{
    //Instance Variable is created whenever an object of the class is created.
    final int finalDemo1=5;//initialize while declaring.
    final int finalDemo2;
    {
        finalDemo2=10; //initialize in Instance Block
        System.out.println("Instance Block.");
    }
    final int finalDemo3;

    FinalVariables()
    {
        finalDemo3=15;//Initialize in Constructor.
    }

    final static String schoolName="XYZ";
    final static String schoolAdd;
    static //Static Block
    {
        schoolAdd="xyz";
    }

    public static void main(String[] args)
    {
        final int a=5;//Final Instance Variable
        System.out.println("Main class = "+a);
        //a++;
        FinalVariables fv1 = new FinalVariables();
        System.out.println(fv1.finalDemo1);
        FinalVariables fv2 = new FinalVariables();
        System.out.println(fv2.finalDemo2);
        FinalVariables fv3 = new FinalVariables();
        System.out.println(fv3.finalDemo3);

        fv3.method1(400);
    }


     public void method1(final int a)
     {
         System.out.println(a);
     }
}
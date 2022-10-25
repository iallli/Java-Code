import java.util.Scanner;
import java.util.Arrays;
public class arrays
{
    public static void main(String[] args)
    {
       int[] arr;//declare
       arr = new int[5];//allocate memory
       arr[0]=1;//initialize
        for(int i:arr)
        {
            System.out.println(i);
        }
        //////////////////////////
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        //////////////////////////
        System.out.println();
        char[] arr1=new char[5];
        Arrays.fill(arr1,'A');
        for(char i:arr1)
        {
            System.out.println(i);
        }
        //////////////////////////
        System.out.println();
        float[] arr2=new float[]{1,2,3,4,5};
        for(float i:arr2)
        {
            System.out.println((int)(i));
        }
        //////////////////////////
        System.out.println();
        int[] arr3=new int[5];
        for(int i=0;i<arr3.length;i++)
        {
            arr3[i]=i+2;
        }
        for(int i:arr3)
        {
            System.out.println(i);
        }
        //////////////////////////
        System.out.println();
        String[] arr4=new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 Strings.");
        for(int i=0;i<arr4.length;i++)
        {
            arr4[i]=sc.next();
        }
        //////////////////////////
        String[] arr5=arr4;
        //////////////////////////
        System.out.println();
        display(arr5);
        //////////////////////////
        int[] arr6 = new int[5];
        input(arr6);
        System.out.println();
        display(arr6);



    }
    public static int[] input(int[] arr6)
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 5 Integers.");
        for(int i=0;i<arr6.length;i++)
        {
            arr6[i]=sc1.nextInt();
        }
        return arr6;
    }
    public static void display(String[] array)
    {
        for(String i:array)
        {
            System.out.println(i);
        }
    }
    public static void display(int[] array)
    {
        for(int i:array)
        {
            System.out.println(i);
        }
    }
}
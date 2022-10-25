import java.util.Scanner;
public class exercises
{
    public static void main(String[] args)
    {
        //Factorial using While Loop.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer.");
        int num=sc.nextInt();
        int fact=1;
        while (num>=1)
        {
            System.out.println(" "+num);
            fact=fact*num;
            num--;
        }
        System.out.println("Factorial is = "+fact);


        //Do While Challenge.
        int input;
        do{
            System.out.println("Enter 2 Numbers.");
            int first=sc.nextInt();
            int second=sc.nextInt();
            int sum=first+second;
            System.out.println("Sum is = "+sum);
            System.out.println("Press 1 to continue or any key to exit.");
            input=sc.nextInt();
        }while (input==1);


        //print Table of a number
        System.out.println("Enter a Number for Table.");
        int num_t=sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(num_t+"*"+i+"="+(num_t*i));
        }

    }
}

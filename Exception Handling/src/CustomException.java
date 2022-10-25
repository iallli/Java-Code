import java.util.Scanner;

public class CustomException
{
    public static void main(String[] args)
    {
        System.out.println("What is your age?");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        if(age<=18)
        {
            throw new TooYoung("You are too young to do this Job.");
        }
        else if (age>=60)
        {
            throw new TooOld("You are too old for this Job.");
        }
        else
        {
            System.out.println("You got this Job.");
        }
    }
}

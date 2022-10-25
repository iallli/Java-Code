public class demo
{
    public static void main(String[] args) {
        System.out.println("Data Types in Java.");

        //      Data Types.
        byte a = 5; //used in the case of stream for file and network.
        short b = 5;//outdated data type.
        int c = 5;
        long d = 5L;//for large values.
        float e = 5.5F;//holds 32-bit/4-bytes data.
        double f = 5;//holds 64-bit/8-bytes data
        char h = 65;
        boolean g = true;

        //      Operators in Java.
        //      Arithmetic Operators in Java.
        System.out.println(c+c);
        System.out.println(c-c);
        System.out.println(c*c);
        System.out.println(c/c);
        System.out.println(c%c);
        System.out.println(++c);
        System.out.println(--c);

        //      Relational Operators in Java.
        if(c<10){System.out.println("Small");}
        if(c>3){System.out.println("Big");}
        if(c>=5){System.out.println("Big");}
        if(c<=5){System.out.println("Small");}
        if(c!=0){System.out.println("Valid");}


        //      Logical Operators in Java.
        if(c>1&&c<10){System.out.println("Valid");}
        if(c>1||c<10){System.out.println("Valid");}


        //      Assignment Operators in Java.
        c=10;
        int sum1=0;
        if(c==10){
            System.out.println("Ten.");
        }
        c+=5;
        System.out.println(c);
        c-=5;
        System.out.println(c);
        c*=5;
        System.out.println(c);
        c/=5;
        System.out.println(c);
        c%=5;
        System.out.println(c);


        //      Conditional Operator.
        System.out.println("Conditional Operator in Java.");
        int ad=56;
        int bd=10;
        int max = (ad>bd) ? ad : bd;
        System.out.println(""+max);


        //      Implicit type Casting.
        System.out.println("Implicit Type Casting in Java.");
        byte bb=5;
        short ss=bb;
        int ii=ss;
        long ll=ii;
        float ff=ll;
        double dd=ff;
        char cc='E';
        int iii=cc;


        //      Explicit type Casting.
        System.out.println("Explicit Type Casting in Java.");
        int iiii=69;
        char ccc=(char)iiii;
        double ddd=10;
        byte bbb=(byte)ddd;


        //      Flow Control Instruction.
        //      if- else if- else
        System.out.println("if-else if-else in Java.");
        if(ad>21)
        {
            if (ad>55)
            System.out.println("Senior Citizen.");
            else if(ad<55)
            System.out.println("Saving Account.");
        }
        else
            System.out.println("Ineligible.");


        //      switch-case
        System.out.println("Switch Case in Java.");
        switch (ad)
        {
            case 0:
            {
                System.out.println("Case 0.");
                break;
            }
            case 1:
            {
                System.out.println("Case 1.");
                break;
            }
            case 2:
            {
                System.out.println("Case 2.");
                break;
            }
            case 3:
            {
                System.out.println("Case 3.");
                break;
            }
            case 4:
            {
                System.out.println("Case 4.");
                break;
            }
            default:
            {
                System.out.println("Default.");
            }
        }

        //      Looping Instructions
        //      for-each loop
        System.out.println("For each Loop in Java.");
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for(int i:arr)
        {
            System.out.println(i);
        }


        //      for loop
        System.out.println("For Loop in Java.");
        for (int i=1;i<=10;i++)
        {
            if (i==5)
                continue;
            System.out.println(" "+i);

        }


        //      while loop
        System.out.println("While Loop in Java.");
        int j=10;
        while (j>=1)
        {
            System.out.println(""+j);
                j--;
                if(j==5)
                {
                break;
                }
        }


        //      do-while loop
        System.out.println("Do While Loop in Java.");
        int k=10;
        do{
            System.out.println(""+k);
            k--;
        }while (k>=1);



        //      Methods
        sayHello();

        int res=displaySum(10,5);
        System.out.println(res);
    }



    public static void sayHello()
    {
        System.out.println("Hello");
    }
    public static int displaySum(int a, int b)
    {
        return(a+b);
    }
}

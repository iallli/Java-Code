package FileHandling;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.*;

public class Main
{
    public static void main(String[] args) throws IOException {

//        File f1 = new File("xyz.txt");
//        System.out.println(f1.exists());

//        String str = System.getProperty("user.dir");
//        System.out.println(str);

//        File f2 = new File("src");
//        System.out.println(f2.exists());

        FileWriter fileWriter = new FileWriter("xyz.txt",true);
//        fileWriter.write("Hello\n");

//        char[] ch =  new char[]{'A','L','I'};
//        fileWriter.write(ch);

//        fileWriter.flush();
//        fileWriter.close();

        FileReader fileReader = new FileReader("xyz.txt");

//        int i = fileReader.read();
//        while (i != -1)
//        {
//            System.out.println((char)i);
//            i=fileReader.read();
//        }

//        char[] c = new char[9];
//        fileReader.read(c);
//        System.out.println(c);

//        char[] ch = new char[10];
//        fileReader.read(ch,0,10);
//        System.out.println(ch);
//        fileReader.close();

        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        int i = bufferedReader.read();
//        while(i != -1)
//        {
//            System.out.println((char) i);
//            i = bufferedReader.read();
//        }
//        bufferedReader.close();

//        char[] c = new char[100];
//        bufferedReader.read(c);
//        System.out.println(c);
//        bufferedReader.close();

//        char[] c = new char[10];
//        bufferedReader.read(c,0,9);
//        System.out.println(c);
//        bufferedReader.close();

//        String s = bufferedReader.readLine();
//        while(s != null)
//        {
//            System.out.println(s);
//            s = bufferedReader.readLine();
//        }
//        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("\nMuhammad");
//        bufferedWriter.close();

//        String str = new String();
//        str = "\nAhmad";
//        bufferedWriter.write(str);
//        bufferedWriter.close();

//        char[] ch = new char[]{'\n','F','a','r','e','e','d'};
//        bufferedWriter.write(ch);
//        bufferedWriter.close();




    }
}
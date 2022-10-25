package FileHandling;

import java.io.*;

public class Challenge
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter printWriter = new PrintWriter("result.txt");
        File file = new File("src/files/txt/");
        String[] str = file.list();
        for (String s:str)
        {
            BufferedReader br = new BufferedReader(new FileReader("src/files/txt/"+s));
            String line = br.readLine();
            while(line != null)
            {
                printWriter.println(line);
                line = br.readLine();
            }
        }
        printWriter.flush();
    }
}

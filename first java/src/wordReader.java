import java.io.*;
public class wordReader
{
    public static void main(String[] args) {
        int count = 0;
        String line;
        try
        {
            FileReader f = new FileReader("abc.txt");
            BufferedReader b = new BufferedReader(f);
            while ((line = b.readLine()) != null) {
                String [] words = line.split(" ");
                count ++;
                count = words.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The file contains " +count+ " words.");
    }

}
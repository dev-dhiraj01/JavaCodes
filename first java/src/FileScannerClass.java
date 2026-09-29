import java.io.IOException;
import java.io.File;
import java.util.Scanner;
//using Scanner class for reading
public class FileScannerClass {
    public static void main(String[] args) {
        try {

            File f = new File("C:\\Users\\Dhiraj\\Desktop\\java\\abc.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine())
            {
                String s1=s.nextLine();
                System.out.println(s1);
            }
            s.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

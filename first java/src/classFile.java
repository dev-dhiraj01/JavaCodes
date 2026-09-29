import java.io.FileWriter;
import java.io.IOException;

public class classFile {
    public static void main(String[] args) throws IOException {

        FileWriter w = new FileWriter("C:\\Users\\Dhiraj\\Desktop\\java\\abc.txt");
        try {
            w.write("java is a good language \n");
            w.write("successfully written in the file");
            System.out.println("successfully written in the file1");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        finally {
            w.close();
        }
    }
}
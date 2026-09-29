import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
            try {

                File f = new File("C:\\Users\\Dhiraj\\Desktop\\java\\abc.txt");
                if (f.createNewFile()) {
                    System.out.println("file is successfully created");
                }
                else
                {
                    System.out.println("file is alrady exsists");
                }
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
    }
}

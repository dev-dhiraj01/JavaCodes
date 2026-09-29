import java.io.IOException;
import java.io.FileReader;

public class ClassFileRead
{
    public static void main(String[] args)
    {
        try {
            FileReader r = new FileReader("C:\\Users\\Dhiraj\\Desktop\\java\\abc.txt");
            try
                {
                    int i;
                    System.out.println("content of file is");
                    while ((i=r.read())!=-1)
                    {
                        System.out.print((char) i);
                    }
                }
            finally
            {
              r.close();
            }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }

    }
}

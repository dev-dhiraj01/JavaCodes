import java.io.FileInputStream;
import java.io.IOException;

public class CreateInputStream {
    public static void main(String[] args) {
        try {
        int s;

        if (args.length > 0) {
            FileInputStream f = new FileInputStream(args[0]);
            s = f.available();
            System.out.println("bytes available in file are" + f);
            char[] str = new char[200];
            for (int i = 0; i <= s; i++) {
                str[i] = ((char) f.read());
                System.out.println(str[i]);
            }

            f.close();
        }
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}

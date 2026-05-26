import java.io.File;
public class FileInput {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Dhiraj\\Desktop\\java\\abc.txt");
        if(f.exists())
        {
            System.out.println("file is"+f.getName());
            System.out.println("file path is "+f.getAbsolutePath());
            System.out.println("length of file is "+f.length());
            System.out.println("do this file is in reading mode "+f.canRead());
            System.out.println("do this file is in writing mode "+f.canWrite());

        }
        else {
            System.out.println("File is not exsist");
        }
    }
}

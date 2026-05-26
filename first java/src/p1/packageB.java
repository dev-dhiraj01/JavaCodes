package p1;
import java.util.Scanner;
public class packageB {
    Scanner s=new Scanner(System.in);
    String name;
    public void gd()
    {
        System.out.println("Enter your name");
        name=s.nextLine();
    }
    public void sd()
    {
        System.out.println("hello "+name);
    }

    public static void main(String[] args) {
        packageB b=new packageB();
        b.gd();
        b.sd();
    }

}

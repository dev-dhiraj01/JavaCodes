//String buffer
import java.util.Scanner;
public class pract3_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=s.nextLine();
        StringBuffer sb=new StringBuffer(str);
        System.out.println("origenal string "+sb);
        sb.insert(8,"java");
        System.out.println("inserted string "+sb);
        sb.replace(15,24,"powerfull");
        System.out.println("replased string "+sb);
        sb.delete(15,24);
        System.out.println("deleted string "+sb);
        sb.reverse();
        System.out.println("reversed string "+sb);
    }
}

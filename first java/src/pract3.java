//operation over string
import java.util.Scanner;
public class pract3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str = s.nextLine();
        System.out.println("origenal string" + str);
        String lowerCaseStr = str.toLowerCase();
        System.out.println("lower case string " + lowerCaseStr);
        String upperCaseStr = str.toUpperCase();
        System.out.println("Upper case string " + upperCaseStr);
       // String reverse = " ";
        for (int i = str.length() - 1; i >= 0; i--) {
            char reverse= str.charAt(i);
            System.out.println("reverse string" + reverse);
        }
    }
}

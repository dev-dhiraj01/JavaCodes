import java.util.Scanner;
public class oddEven1 {
    public static void main(String args[])
    {
        int a=15;

        Scanner s=new Scanner(System.in);
        System.out.println("enter a number to check");
        a=s.nextInt();
        if(a%2==0) {
            System.out.println(" number is even");
        }
        else {
            System.out.println("number is odd");

        }
    }
}

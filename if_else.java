import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int age = S.nextInt();
        if (age > 18) {
            System.out.println("eligible for voting");
        } else {
            System.out.println("not eligible for voting");
        }

    }

}

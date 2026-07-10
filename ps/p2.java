import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Backup original number
        int original = num;

        // Check Armstrong Number
        int sum = 0, digits = 0, temp = num;

        // Count digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

        // Calculate Armstrong sum
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        // Print reverse digits
        System.out.print("Digits in reverse order: ");
        temp = original;
        while (temp != 0) {
            System.out.print(temp % 10 + " ");
            temp /= 10;
        }

        sc.close();
    }
}

import java.util.Scanner;

public class ControlSt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        System.out.print("\nEnter a limit for the loop: ");
        int n = scanner.nextInt();

        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        int input;
        do {
            System.out.print("\nEnter a number greater than 5: ");
            input = scanner.nextInt();
        } while (input <= 5);
        System.out.println("Valid input received: " + input);

        System.out.println("\nFinding first multiple of 7 in range 1 to " + n);
        for (i = 1; i <= n; i++) {
            if (i % 7 == 0) {
                System.out.println("First multiple of 7 found: " + i);
                break;
            }
        }

        System.out.println("\nOdd numbers from 1 to " + n + ":");
        for (i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("\nEnter a day number (1-7): ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number!");
        }

        scanner.close();
        
    }
}

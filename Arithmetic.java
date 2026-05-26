
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n===== Arithmetic Operations Menu =====");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Modulo (%)");
            System.out.println("6. Exit");
            System.out.println("Enter your choice (1-6): ");

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 5) {
               
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                
                switch (choice) {
                    case 1:
                        System.out.println("Result: " + (num1 + num2));
                        break;
                    case 2:
                        System.out.println("Result: " + (num1 - num2));
                        break;
                    case 3:
                        System.out.println("Result: " + (num1 * num2));
                        break;
                    case 4:
                        if (num2 != 0)
                            System.out.println("Result: " + (num1 / num2));
                        else
                            System.out.println("Error: Division by zero is not allowed!");
                        break;
                    case 5:
                        if (num2 != 0)
                            System.out.println("Result: " + (num1 % num2));
                        else
                            System.out.println("Error: Modulo by zero is not allowed!");
                        break;
                }
            } else if (choice == 6) {
                System.out.println("Exiting the program. Thank you!");
            } else {
                System.out.println("Invalid choice! Please enter a valid option (1-6).");
            }
        } while (choice != 6);

        scanner.close();
    }
}

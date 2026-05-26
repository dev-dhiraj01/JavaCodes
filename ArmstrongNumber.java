import java.util.Scanner;

abstract class myclass{
    int a =90;
    abstract void show();
}

public class ArmstrongNumber {
    public static void main(String[] args) {
        myclass m = new myclass(){
            public void show(){
                System.out.println(a);
            }
        };
        m.show();
    //     Scanner scanner = new Scanner(System.in);

    //     System.out.print("Enter a number: ");
    //     int num = scanner.nextInt();

    //     if (isArmstrong(num)) {
    //         System.out.println(num + " is an Armstrong number.");
    //     } else {
    //         System.out.println(num + " is NOT an Armstrong number.");
    //     }

    //     System.out.print("Digits in reverse order: ");
    //     printReverse(num);

    //     scanner.close();
    // }

    // public static boolean isArmstrong(int number) {
    //     int originalNum = number, sum = 0, digits = 0, temp = number;

    //     while (temp > 0) {
    //         digits++;
    //         temp /= 10;
    //     }

    //     temp = number;

    //     while (temp > 0) {
    //         int digit = temp % 10;
    //         sum += Math.pow(digit, digits);
    //         temp /= 10;
    //     }

    //     return sum == originalNum;
    // }

    // public static void printReverse(int number) {
    //     while (number > 0) {
    //         System.out.print(number % 10 + " ");
    //         number /= 10;
    //     }
    //     System.out.println();
    }
}

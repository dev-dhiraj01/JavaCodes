import java.util.Scanner;

public class VariableLengthArr {
    public static void main(String[] args) {
        System.out.println("enter the number of array : ");
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int[][] arr = new int[row][];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter the length of " + i + "th array");
            int leng = sc.nextInt();

            arr[i] = new int[leng];
            System.out.println("enter the elements of the array : ");

            for (int j = 0; j < leng; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

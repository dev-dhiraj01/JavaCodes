import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];
        
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 4; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for(int[] arr1 : arr){
            for(int ele:arr1)
            System.out.print(ele+" ");
        System.out.println();
        }

        sc.close();
    }
}

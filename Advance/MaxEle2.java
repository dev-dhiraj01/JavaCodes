import java.util.*;
// solve 1800

public class MaxEle2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int maxSum = Integer.MIN_VALUE;
        String str = "Dhiraj";
        System.out.println(str.substring(2, 5));        
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            
                sum += arr[i];
                maxSum = Math.max(maxSum, sum);
            
        }
        System.out.println(maxSum);
        sc.close();
    }
}

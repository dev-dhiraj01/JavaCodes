import java.util.*;

public class MaxEle {    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5, 6 };
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
                for (int k = i; k < arr.length; k++) {
                    sum += arr[k];
                    maxSum = Math.max(maxSum,sum);
                }
        }
        System.out.println(maxSum);
        sc.close();
    }
}


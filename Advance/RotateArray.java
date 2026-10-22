
// public class RotateArray {

//     public static void reverse(int arr[], int start, int end) {
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }
//     }

//     static class Solution {
//         public int[] rotate(int[] nums, int k) {
//             int n = nums.length;

//             int arr[] = new int[n];
//             for (int i = 0; i < n; i++) {
//                 arr[(i + k) % n] = nums[i];
//             }
//             return arr;
//         }
//     }

//     public static void main(String args[]) {

//         int arr[] = { 4, 5, 6, 7, 8, 9, 0 };
//         int k = 3;

//         Solution s = new Solution();
//         int rotated[] = s.rotate(arr, k);

//         for (int i : rotated) {
//             System.out.print(i + " ");
//         }
//     }
// }

class RotateArray {

    public static void rotate(int s, int e, int[] arr) {

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

    }

    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 7;
        int n = arr.length - 1;
       
        rotate(0, n - k, arr);
        rotate(n - k + 1, n, arr);
        rotate(0, n, arr);

        for (int i : arr) {
        System.out.print(i + " ");
        }

    }

}
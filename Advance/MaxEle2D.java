
public class MaxEle2D {
    public static void main(String[] args) {

        int[][] arr = { { 1, 22, 3, 4 }, { 5, 6, 8, 2, 9 } };

        int maxEle = arr[0][0];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                maxEle = Math.max(maxEle,arr[row][col]);
            }
        }
        System.out.println(maxEle);
    }
}

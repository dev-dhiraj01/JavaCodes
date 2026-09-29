public class SimplePattern {
    public static void main(String args[]) {

        int n = 5; 

        for(int row = 1; row <= n; row++){
            char ch = 'A';
            for(int col = 1; col <= row; col++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}

        //         int n = 4;

        // for (int row = 1; row <= n; row++) {
        //     for (int space = 1; space <= n - row; space++) {
        //         System.out.print("  ");
        //     }

        //     if (row == 1) {
        //         for (int col = 1; col <= 2 * row - 1; col++) {
        //             System.out.print("* ");
        //         }
        //     } else {
        //         System.out.print("* ");

        //         for (int col = 1; col <= 2 * row - 3; col++) {
        //             System.out.print("  ");
        //         }
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // for (int row = n-1; row >= 1; row--) {
        //     for (int space = 1; space <= n - row; space++) {
        //         System.out.print("  ");
        //     }

        //     if (row == 1) {
        //         for (int col = 1; col <= 2 * row - 1; col++) {
        //             System.out.print("* ");
        //         }
        //     } else {
        //         System.out.print("* ");

        //         for (int col = 1; col <= 2 * row - 3; col++) {
        //             System.out.print("  ");
        //         }
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //       * 
        //     *   * 
        //   *       * 
        // *           * 
        //   *       * 
        //     *   * 
        //       * 
        //      Dymand Patteren

        //         int n = 5;
        
        // for(int row = 1; row <= n; row++){
        //     for(int space = 1; space <= n- row; space++ ){
        //         System.out.print("  ");
        //     }

        //     for(int col = 1; col <= 2*row -1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // //second pyramid
        // for(int row = 1; row <= n; row++){
        //     if(row == 1)
        //         continue;
        //     for(int space = 1;space <= row-1 ; space++ ){
        //         System.out.print("  ");
        //     }

        //     for(int col = 1; col <= 2* n- 2 * row + 1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        //         * 
        //       * * * 
        //     * * * * * 
        //   * * * * * * * 
        // * * * * * * * * * 
        //   * * * * * * * 
        //     * * * * * 
        //       * * * 
        //         * 

        //     int n = 5;

        // for(int row = 1; row <= n;row++){
        //     for(int space = 1; space <= n - row  ; space++){
        //         System.out.print("  ");
        //     }

        //     if(row == 1 || row == n){
        //         for(int col = 1; col <= 2*row -1; col++){
        //             System.out.print("* ");
        //         }
        //     }else{
        //         System.out.print("* ");

        //         for(int col = 1; col <= 2*row-3; col++){
        //             System.out.print("  ");
        //         }
        //         System.out.print("* ");
        //     }
        //         System.out.println();
        // }
        //         * 
        //       *   * 
        //     *       * 
        //   *           * 
        // * * * * * * * * * 
    //Hallow Triangle 
        //     int n = 5;

        // for (int row = 1; row <= n; row++) {

        //     if (row == 1 || row == 2 || row == n) {
        //         for (int col = 1; col <= row; col++) {
        //             System.out.print("* ");
        //         }
        //     } else {
               
        //         System.out.print("* ");

        //         for(int space = 1; space <= row - 2; space++){
        //             System.out.print("  ");
        //         }
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //         * 
        //         * * 
        //         *   * 
        //         *     * 
        //         * * * * * 
                
// Hallow rectangle
// int n = 4;

// for (int row = 1; row <= n; row++) {
// for (int col = 1; col <= 6; col++) {
// if (row == 1 || row == n) {
// System.out.print("* ");
// } else {
// if (col == 1 || col ==6) {
// System.out.print("* ");
// } else {
// System.out.print(" ");
// }
// }
// }
// System.out.println();
// }
// * * * * * *
// * *
// * *
// * * * * * *

// int n = 5;

// for(int row = n; row >= 1; row--){
// for(int space = 1; space <= n-row; space++){
// System.out.print(" ");
// }

// for(int col = 1 ; col <= 2*row-1; col++){
// System.out.print("* ");
// }
// System.out.println();
// }
// * * * * * * * * *
// * * * * * * *
// * * * * *
// * * *
// *

// int n = 10;

// for(int row = 1; row <= n; row++){
// for(int col = 1; col <= n - row+1; col++){
// System.out.print("* ");
// }
// System.out.println();
// }

// * * * * *
// * * * *
// * * *
// * *
// *

// int n = 5;

// for(int row = 1; row <= n; row++ ){
// for(int space = 1; space <= n- row; space++){
// System.out.print(" ");
// }
// for(int col = 1; col <= n; col++){
// System.out.print("* ");
// }
// System.out.println();
// }

// Solid Rombus pattern

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

// int n = 5;

// for(int row = 1; row <= n; row++){
// for(int col = 1; col <= row; col++){
// System.out.print("* ");
// }
// System.out.println();
// }

// *
// * *
// * * *
// * * * *
// * * * * *
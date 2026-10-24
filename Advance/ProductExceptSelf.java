class ProductExceptSelf {
    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5}; 
        
        int n = arr.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            int ans = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                ans *= arr[j];
                res[i] = ans;
            }
        }
        for (int i : res) {
            System.out.print(i + " ");
        }



    }
}


class MaxSubArray{
    public static void main(String args[]){

        int arr[] = {1,2,3,4,5};

        for(int i = 0; i < arr.length;i++){
            System.out.println();
            for(int j = i; j < arr.length;j++){
                int sum = 0;
                System.out.print(" ");
                for(int k = i; k <= j;k++ ){
                    sum += arr[k];
                }
                System.out.println(sum);
            }
        }
    }
}
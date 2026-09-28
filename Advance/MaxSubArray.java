//Kadane's Algorithm

class MaxSubArray{
    public static void main(String args[]){

        int nums[] = {3,-4,5,4,-1,7,-8};
        int n = nums.length;

        // int maxSum = Integer.MIN_VALUE;
        // for(int start = 0; start < arr.length; start++){
        //     for(int end = start; end < arr.length; end++){
        //         int currSum = 0;
        //         for(int i = start; i <= end; i++ ){
        //             System.out.print(arr[i]+" ");
        //             currSum += arr[i];
        //         }
        //         maxSum = Math.max(maxSum,currSum);
        //         System.out.print( "  ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(maxSum);


        //optimization

        // int maxSum = Integer.MIN_VALUE;

        // for(int start = 0; start < n; start++){
        //     int currSum = 0;
        //     for(int end = start; end < n; end++){
        //         currSum += nums[end];
        //         maxSum = Math.max(maxSum, currSum);
        //     }
        // }
        // System.out.println(maxSum);

        //Kadane's Algorithm 
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int start = 0; start < n; start++){

            currSum += nums[start];
            maxSum  = Math.max(currSum, maxSum);

            if(currSum < 0){
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
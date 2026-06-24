class Day9{

    static int binSearch(int arr[], int s , int e, int target){

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                s = mid+1;
            }
            else{
                e = mid -1;
            }
        }
            return -1;
    }
    public static void main(String args[]){
        int Box[] = {12,23,34,45,67,89};
        int target = 67;

        for(int i = 0; i < Box.length; i++){

            if(Box[i] == target){
                System.out.println("laddu box found at index : "+i);
            }
        }

        System.out.println(binSearch(Box,0,Box.length,67));
    }
}
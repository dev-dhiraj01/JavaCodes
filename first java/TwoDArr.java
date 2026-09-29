
class TwoDArr{

    public static void main(String[] args){

        int arr[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        
        for(int[] ar : arr){
            for(int i : ar){
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
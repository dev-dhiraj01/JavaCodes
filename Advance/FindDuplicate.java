import java.util.Map;
import java.util.LinkedHashMap;

class FindDuplicate{
    public static void main(String args[]){

        int[] nums = {1,2,3,4,1,2,4,5};

        Map<Integer,Integer> duplicate = new LinkedHashMap<>();

        for(int num : nums ){
            duplicate.put(num,duplicate.getOrDefault(num,0)+1);
        }

        duplicate.forEach((k,v) ->{
            if(v == 2){
                System.out.println(k);
            }
        });

       
    }
}
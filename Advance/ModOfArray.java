
import java.util.HashMap;
import java.util.Map;

class ModOfArray {
    public static void main(String[] args) {

        int[] arr = { 1,1,1, 2, 3, 4, 5, 2, 3, 2, 4,4,4,4,4}; 
        
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i : arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int mod = -1;

        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            if(entry.getValue() > mod){
                mod = entry.getKey();
            }
        }
        System.out.println(mod);

    }
}

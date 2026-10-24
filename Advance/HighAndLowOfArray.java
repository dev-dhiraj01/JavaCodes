
import java.util.HashMap;
import java.util.Map;

class HighAndLowOfArray {
    public static void main(String[] args) {

        int[] arr = { 1, 1, 1, 2, 3, 4, 5, 2, 3, 2, 4, 4, 4, 4, 4 };

        int lowestFreq = Integer.MAX_VALUE;
        int hieghstFreq = Integer.MIN_VALUE;
        int lowNum = 0;
        int highNum = 0;
        
        Map<Integer, Integer> freq = new HashMap<>();

        for(int i : arr){
            freq.put(i,freq.getOrDefault(i,0)+1);
            
        }

        for (int i : freq.keySet()) {
            if (freq.get(i) > hieghstFreq) {
                hieghstFreq = freq.get(i);
                highNum = i;
                
            }
            if (freq.get(i) < lowestFreq) {
                lowestFreq = freq.get(i);
                lowNum = i;
            }
        }

        System.out.println("The lowest frequency is: " + lowestFreq + " -> " + lowNum);
        System.out.println("The highest frequency is: " + hieghstFreq + " -> " + highNum);
           
    }
}

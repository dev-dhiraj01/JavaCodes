import java.util.HashMap;

public class day5{

    public static void main(String[] args){

        int a = 12, b = 18;
        int gcd = 1;

        for(int i = 1 ; i < Math.min(a,b); i++){
            if(a%i == 0 && b% i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        
        //a news wevsite wants to count the repeated words "java is easy java is powerfull";
        String sentence = "java is easy java is powerfull";
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        System.out.println(wordFrequency);

    }
    
}
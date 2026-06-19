import java.util.HashMap;
import java.util.Scanner;

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

        //printing the prime numbers till n 

    int n = 10;
    int id = 0;
    for(int i = 1; i <= n ; i++){
        for(int j = 2; j < i ; j++){
            if(i% j == 0){
                break;
            }else{
                id = i;
            }
        }
        System.out.println(id);
    }

    //an online game issues participent id's the platform rewords players whose id are prime no with bonus point before awarding the bonus the system must verify whether the id is prime id = 51

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the Id");
    int num = 5;
    boolean flag = true;
    
    for(int i = 2; i < num; i++){
        if(num%i == 0){
            flag = false;
            break;
        }
        else{
            flag = true;
            
        }
    }
    if(flag == true){
        System.out.println("the id "+num+ " is a prime ");
    }
    else{
        System.out.println("the id "+num+ " is not prime ");
    }

   

    //rotate array elements k times 
    // find maximum sum sub array of size 3

    int arr[] = {11,2,3,4,5};
    int max = 0;
    n= 5;
    for(int i = 0; i < n-2; i++){
            int sum = 0;
        for(int j = i ; j < i + 3; j++){
            sum += arr[j];
        }
        max = Math.max(sum,max);
    }
    System.out.println(max);


    String name = "nayan";
    char[] arr1 = name.toCharArray();
    int s = 0;
    int e = name.length()-1;

    while(s<e){
        char temp = arr1[s];
        arr1[s] = arr1[e];
        arr1[e]= temp;
        s++;
        e--;
    }
  name = new String(arr1);
    System.out.println(name);

    //a smart city pro has installed 100 of sensors accross different areas to monitor traffic air quality and public safety each sensor is assigned a unique id no engineers have classified certain sensor as critical sensors based of a math rule related to the id no your task is to determine whether a given sensor belongs to the critical monitoring group input sensor Id = 97 and output critical sensor detected


    System.out.println("enter the Sensor Id");
    int num2 = 97;
    boolean flag1 = true;
    
    for(int i = 2; i < num2; i++){
        if(num2%i == 0){
            flag1 = false;
            break;
        }
        else{
            flag1 = true;
            
        }
    }
    if(flag == true){
        System.out.println("the id "+num2+ "is a Sensor ");
    }
    else{
        System.out.println("the id "+num2+ " is not Sensor ");
    }

    //a company receives customer feedback msg everyday to identify unique patterens in customer communication the analytics team wants to find first character that appears only once in a feed back this helps them to detect uncommon keywords and special identifiers in the text input String feedback = aabbcdde 

    String str = "aabbcdde";
    HashMap<Character , Integer> feedback = new HashMap<>();
    for(int i = 0; i < str.length();i++){
        char c = str.charAt(i);
        if(feedback.containsKey(c)){
            feedback.put(c,feedback.get(c)+1);
        }
        else{
            feedback.put(c,1);
        }
    }
    for(int i = 0; i < str.length();i++){
        char c = str.charAt(i);
        if(feedback.get(c) == 1){
        
        System.out.println("The first character with single occurence is "+ c);
        break;
        }
    }

    // an ecommerce comp receives 1000 of orders everyday the analytics team wants to determine how many time each product has been ordered so that they can identify popular items and manage inventory effectively given a list of product names count how many time each product has been ordered string orders = laptop mobils lap headphones mob lap
    
    String orders = "laptop mobile laptop headphone mobile";
    HashMap<String, Integer> freqency1  = new HashMap<>();
    String[] words1 = orders.split(" ");

    for(String word1 : words1){
        if(freqency1.containsKey(word1)){
            freqency1.put(word1,freqency1.get(word1)+1);
        }
        else{
            freqency1.put(word1,1);
        }
    }
    System.out.println(freqency1);

    sc.close();

    }
}
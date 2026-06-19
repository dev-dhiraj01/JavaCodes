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

    sc.close();

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


    }
}
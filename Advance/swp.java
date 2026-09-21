import java.util.*;

public class swp{
    public static void main(String args[]){

        String str1 = "tea";
        String str2 = "eat";

        char arr1[]= str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr2,arr1)){
            System.out.println("Is an Anagram");
        }
        else{
            System.out.println("not an Anagram");
        }

    }
}
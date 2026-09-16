import java.util.Scanner;

public class Main {
    static int total(int[] arr){

        int ans = 0;
        for(int i : arr){
            ans += i;
        }
        return ans;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];    

    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }   
    System.out.println(total(arr)); 
    }
}

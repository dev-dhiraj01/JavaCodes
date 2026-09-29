import java.util.Scanner;

public class patterens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of n: ");
        // int n = sc.nextInt();
        int n=5;
        System.out.println("size of n is :"+ n);

        for(int i = 0 ; i < n;i++){
            for(int j = 0 ; j <= i ; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("print second pattern : ");
        for(int i = n ; i > 0;i--){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }

        System.out.println("print third pattern : ");
        for(int i = 0 ; i < n;i++){
            for(int k = 0;k < n-i;k++){
                System.out.println(" ");
            }
            for(int j = 0 ; j < i ; j++){
                System.out.print(" *");
            }
            System.out.println("");
        }
        sc.close();
        int arr[] ={1,2,3,4,5};
        int arr1[] = arr; 
         
        for(int i = 0 ; i < arr1.length;i++){
            arr1[i] = arr1[i]*2;
        }
        
        for(int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

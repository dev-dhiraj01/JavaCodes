// package Advance;

public class day1 {
    
    int arr[] = new int[5];
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        day1 obj = new day1();
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < obj.arr.length; i++) {
            obj.arr[i] = sc.nextInt();
        }

        System.out.println("Printing elements using simple for loop:");
        for (int i = 0; i < obj.arr.length; i++) {
            System.out.println(obj.arr[i]);
        }
        System.out.println("Printing elements using for each loop:");
        for (int i : obj.arr) {
            System.out.println(i);
        }
        System.out.println("Printing elements using while loop:");
        
        int i = 0;
        while (i < obj.arr.length) {
            System.out.println(obj.arr[i]);
            i++;
        }
        System.out.println("Printing elements using do-while loop:");
        i = 0;
        do {
            System.out.println(obj.arr[i]);
            i++;
        } while (i != obj.arr.length);
        sc.close();
    }

}

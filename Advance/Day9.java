import java.util.*;

public class Day9 {

    // Task 5: Binary Search Method
    public static int binarySearch(int[] arr, int target) {
        int s = 0, e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return -1;
    }

    // Task 6: Recursion Method
    public static int totalPoints(int days) {
        if (days == 1) {
            return 1;
        }
        return days + totalPoints(days - 1);
    }

    // Task 4: Prime Check Method
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] chocolates = {5, 8, 3, 10, 6};
        String secretMessage = "LEVEL";
        String couponCode = "aabbcde";
        int[] prizes = {10, 20, 30, 40, 50, 60};
        int luckyToken = 29;
        int permissions = 5;      
        int bonusPermission = 3;  
        int days = 5;
        int target = 40;

     

        int totalChocolates = 0;
        int maxChocolates = chocolates[0];

        for (int choco : chocolates) {
            totalChocolates += choco;
            if (choco > maxChocolates) {
                maxChocolates = choco;
            }
        }

        System.out.println("Total Chocolates = " + totalChocolates);
        System.out.println("Maximum Chocolates = " + maxChocolates);
        System.out.print("Reverse = ");
        for (int i = chocolates.length - 1; i >= 0; i--) {
            System.out.print(chocolates[i] + " ");
        }
        System.out.println();

        
        String reversed = new StringBuilder(secretMessage).reverse().toString();

        if (secretMessage.equals(reversed)) {
            System.out.println("Secret Message Verified");
        } else {
            System.out.println("Secret Message Not Verified");
        }


        
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : couponCode.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        char firstUnique = '\0';
        for (char ch : couponCode.toCharArray()) {
            if (map.get(ch) == 1) {
                firstUnique = ch;
                break;
            }
        }

        System.out.println("First Unique Character = " + firstUnique);


        

        if (isPrime(luckyToken)) {
            System.out.println("Lucky Token");
        } else {
            System.out.println("Not a Lucky Token");
        }

        

        int index = binarySearch(prizes, target);

        if (index != -1) {
            System.out.println("Prize Found at Index " + index);
        } else {
            System.out.println("Prize Not Found");
        }

        

        System.out.println(totalPoints(days));

        

        System.out.println("AND = " + (permissions & bonusPermission));
        System.out.println("OR = " + (permissions | bonusPermission));
        System.out.println("XOR = " + (permissions ^ bonusPermission));
        System.out.println("Left Shift = " + (permissions << 1));
        System.out.println("Right Shift = " + (permissions >> 1));

    }
}
// doremon maintains a digital inventory of gajets inside its 4d pockate to quickly locate a gaget the inventory sys automatically arrenge all gaget ids in ascending order one day nobita argently needs a gaget to complete his homework since the inventory contains thousants of gagets checking each gaget one by one would take toomuch time doremon decides an efficient search technique that repeatedly narrows the search space by half until the require gaget is found gagdet 105 105 110 115 120 125 139 t = 120
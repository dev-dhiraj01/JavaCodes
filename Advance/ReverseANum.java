public class ReverseANum {
    public static void main(String[] args) {
        int num = 1498;
        
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            num /= 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println(reverse);
    }
}

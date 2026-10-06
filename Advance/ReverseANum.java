public class ReverseANum {
    public static void main(String[] args) {
        int num = 1991;
        int num2 = num;
        int reverse = 0;
        while(num != 0){
            int digit = num % 10;
            num /= 10;
            reverse = reverse * 10 + digit;
        }
        
        System.out.println(num2 == reverse);

        int prime = 11;

        for(int i = 2; i * 2 <= prime; i++){
            if(prime % i == 0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}

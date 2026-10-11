
public class PrimeNumTillN {

        int n;
    static boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }


    public static void main(String[] args) {

        int n = 100;
        String name = "Dhiraj";
       System.out.printf("the number is : %s, %d ",name,n);
        for (int num = 2; num <= n; num++) {
            boolean flag = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println(num);
            }
        }
    }
}

public class PrimeNumTillN {

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
        for (int num = 2; num <= n; num++) {
            boolean flag = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
                else{
                    flag = true;
                }
            }

            if(flag){
                System.out.println(num);
            }
        }
    }
}


class Gcd {

    static int ans(int a, int b) {

        if (b == 0) {
            return a;
        }

        return ans(b, a % b);

    }

    public static void main(String... args) {

        int a = 12;
        int b = 18;

        System.out.println(ans(a, b));

    }
}
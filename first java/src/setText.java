public class setText {
    public static void main(String[] args) {
        System.out.println("Dhiraj v chaudahari 2207804");
        System.out.println("user difined exception");
        try {
            throw new MyExp();
        } catch (MyExp e) {
            System.out.println("caugth");
            System.out.println(e.getMessage());
        }
    }
}

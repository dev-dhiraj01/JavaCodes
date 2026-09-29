public class Sum {
    public static void main(String[] args) {
        String str = "123456789";
        int a = (int)str.charAt(0);
        int b = (int)str.charAt(str.length()-1);
        System.out.println((a - '0')+(b - '0'));
       
    }
}

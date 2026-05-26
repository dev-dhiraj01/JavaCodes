public class Exception1 {
    public static void main(String[] args) {
        System.out.println("program for exceprion handling");
        System.out.println("Dhiraj v chaudhari 2207804");
        try
        {
            int a=10;
            int b=0;
            int c;
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("devided by zero");
        }
        System.out.println("Normal Termination");
    }
}

public class exceptionExample {

    public static void main(String[] args) {
        try {
                int a=10,b=0,c;
                c=a/b;
                System.out.println(c);
            }
        catch (Exception e)
            {
                System.out.println("cant devide by zero");
            }
        System.out.println("normal termination");
    }
}

public class multiCatch {

    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            int c;
            c=a/b;
            System.out.println(c);
            String str="shiv";
            int d ;
            System.out.println(str.toLowerCase());
           String str1=null;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException n)
        {
            System.out.println(n);
        }
        catch (NumberFormatException f)
        {
            System.out.println(f);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("normal Termination");
    }
}

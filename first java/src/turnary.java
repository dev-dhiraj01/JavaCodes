import java.util.Scanner;
class turnary
{
    public static void main(String args[])
    {
        System.out.println("enter a number");
        Scanner s=new Scanner(System.in);
        int a= s.nextInt();
        String msg;
        msg= (a>0)? " positive":" negitive";
        String msg1=(a%2==0) ?" even":" odd";
    }
}
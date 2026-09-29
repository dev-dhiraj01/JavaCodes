import java.util.Scanner;

public class throwEx {
    public static void main(String[] args) {
        int age;
        Scanner s=new Scanner(System.in);
        System.out.println("enter your age ");
        age=s.nextInt();
        if(age<18)
        {
            throw new AgeException("not eligible");

        }
        else
        {
            System.out.println("eligible for voting ");
        }
    }
}
class AgeException extends RuntimeException
{
    AgeException(String msg)
    {
        super(msg);
    }
}

import java.util.Scanner;
public class pract1_1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("NAME :- DHIRAJ CHAUDHARI 2207804");
        System.out.println("Enter a number between 1 to 100");
        int num = s.nextInt();
        if (num<1||num>100)
        {
            System.out.println("Invalid input");
        }
        if(num%2==0)
        {
            System.out.println(num+" number is Even");
        }
        else {
            System.out.println(num+"number id odd");
        }
       boolean flag = false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag = true;
                break;
            }
        }
        if(!flag)
        System.out.println(num+"is a prime number");
        else
            System.out.println(num+"is not prime");
    }

}











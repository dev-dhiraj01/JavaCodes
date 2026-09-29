import java.util.Scanner;
public class nestingForLoop {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of lines");
        int i,j,n;
        n=s.nextInt();
        for(i=1;i<n;i++)
        {
            for(j=1;j<i;j++)
            {
                System.out.println("*");
            }
            System.out.print(" ");
        }
        }
}

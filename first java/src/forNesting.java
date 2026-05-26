import java.util.Scanner;
public class forNesting {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of lines ");
        int i,j;
        int n=s.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println( );
        }
    }
}

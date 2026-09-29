import java.util.Scanner;
public class arrays {
    public static void main(String [] args)
    {
        Scanner S =new Scanner(System.in);
        int i,j;
        // System.out.println("enter the numbers of rows");
        // m=S.nextInt();
        // System.out.println("enter the numbers of columns");
        // n=S.nextInt();
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];

        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                a[i][j]=S.nextInt();
            }
            b[i][j]=S.nextInt();
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("addition of matrix");
            for(i=0;i<=2;i++)
            {
                for(j=0;j<=2;j++)
                {
                    System.out.println(c[i][j]+" ");
                }
                System.out.println();
            }
        }

    }
    
}

import java.util.Scanner;
public class metricesAddi {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        int i,j;

        for (i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                a[i][j] = s.nextInt();
            }
            for(j=0;j<=2;j++)
            {
                b[i][j] = s.nextInt();
            }

        }
        for (i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Addition of two metrices =");
        for (i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println( );
        }

    }
}

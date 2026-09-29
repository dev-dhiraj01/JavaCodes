import java.util.Scanner;
public class matrixMultiplication {
    public static void main(String args [])
    {
        Scanner s=new Scanner(System.in);
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{4,5,6},{7,8,9},{1,2,3}};
        int c[][]=new int[3][3],i,j;
//        int c[][]={{7,8,9},{1,2,3},{4,5,6}},i,j;
//        a=new int[][];
//        b=new int[][];
//        c=new int[][];
        System.out.println("enter the numbers in matrix");
        for (i=0;i<3;i++)
        {
//            for (j=0;j<3;j++)
//            {
//                a[i][j]=s.nextInt();
//                System.out.println(a[i][j]);
//                b[i][j]=s.nextInt();
//                System.out.println(b[i][j]);
//            }
            for (i=0;i<3;i++)
            {
                for (j=0;j<3;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
            System.out.println("addition of Metrix ");
            for (i=0;i<3;i++)
            {
                for (j=0;j<3;j++)
                {
                    System.out.println(c[i][j]);
                }
                System.out.println();
            }

            }
        }
    }


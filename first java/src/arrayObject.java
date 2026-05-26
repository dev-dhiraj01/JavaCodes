import java.util.Scanner;

public class arrayObject {

    String ename;
    int eage;
    void gd(Scanner s,int i)
    {
        System.out.println("enter the name of employee : "+(i+1));
        ename =s.nextLine();

        System.out.println("enter the age of employee : "+(i+1));
        eage=s.nextInt();
        s.nextLine();
    }
    void sd()
    {
        System.out.println(ename+" "+eage);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter  number of employee");
        int n = s.nextInt();
        s.nextLine();
        arrayObject a[]=new arrayObject[n];
        for (int i=0;i<n;i++)
        {
            a[i]=new arrayObject();
        }
        for (int i=0;i<n;i++)
        {
            a[i].gd(s,i);
        }
        for (int i=0;i<n;i++)
        {
            a[i].sd();
        }
        s.close();
    }
}

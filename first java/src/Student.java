import java.util.Scanner;

public class Student {
        String name,branch;
        int rno;

    Scanner s=new Scanner(System.in);
       public void getdata()

        {

            name=s.next();
            branch=s.next();
            rno=s.nextInt();

        }
        public void showdata()
        {
            System.out.println(name+rno+branch);
        }

    public static void main(String[] args) {
        Student [] st=new Student[5];
        System.out.println("enter the name rno and branch of the student");
        for (int i=0;i<=4;i++)
        {
            st[i]=new Student();
        }
        for (int i=0;i<=4;i++)
        {
            st[i].getdata();
        }
        for (int i=0;i<=4;i++)
        {
            st[i].showdata();
        }
    }

    }


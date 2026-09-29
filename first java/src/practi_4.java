//constractor overloading
import java.util.Scanner;

class practi_4
{
    String name;
    int rno;
    void gd()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the data");
        name=s.nextLine();
        rno= s.nextInt();

    }
    void sd()
    {
        System.out.println(name+" has roll no as "+rno);
    }
    practi_4(String name, int rno)
    {
        this.name=name;
        this.rno=rno;
    }
    practi_4()
    {
        name=null;
        rno=0;
    }
    practi_4(practi_4 c)
    {
        name=c.name;
        rno=c.rno;
    }

    public static void main(String[] args) {
        practi_4 c1=new practi_4();
        c1.gd();
        c1.sd();
        practi_4 c2=new practi_4("dhiraj",12);
        c2.sd();
        practi_4 c3=new practi_4(c2);
        c3.sd();
    }
}
















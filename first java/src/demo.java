//program for use of interface
import java.util.Scanner;
interface salary
{
     void input();
     void output();

}
public class demo implements salary
{
    String name;
    int salary;
    public void input()
    {
        Scanner sa=new Scanner(System.in);
        name=sa.nextLine();
        salary=sa.nextInt();
    }
    public void output() {
        System.out.println("mr/ms"+name+"has salary"+salary);
    }

    public static void main(String[] args) {
        salary a=new demo();
        a.input();
        a.output();
    }
}

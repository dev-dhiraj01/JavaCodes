//array of object
import java.util.Scanner;
public class sample1 {
    int rno, id;
    String name;

    void gd()
    {
        Scanner s = new Scanner(System.in);
        rno = s.nextInt();
        name = s.nextLine();
        id = s.nextInt();

    }
    void sd()
    {
        System.out.println(name+id+rno);
    }
   // sample s1=new sample();
   public static void main(String[] args) {

       sample1 e[] = new sample1[3];
       for (int i = 0; i < 3; i++)
       {
           e[i]=new sample1();
       }
       for (int i = 0; i < 3; i++)
       {
           e[i].gd();
       }
       for (int i = 0; i < 3; i++)
       {
           e[i].sd();
       }
   }
}

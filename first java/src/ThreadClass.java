import java.lang.Thread;
class even extends Thread
{ public void run()
    { System.out.println("Even no:- ");
        for(int i=1;i<=20;i++){
            if (i % 2 == 0) {
                System.out.println(i);
            } } }
}
class add extends Thread {
    public void run()
    { System.out.println("odd no:- ");
        for(int i=1;i<=20;i++)
        {
            if (i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) {
        System.out.println("");
        even e= new even();
        e.start();
        add a=new add();
        a.start();
    }
}











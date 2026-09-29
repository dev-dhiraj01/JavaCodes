class enven implements Runnable
{ public void run()
    { for (int i=0;i<=10;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            } }
    } }
public class Runnable1 {
    public static void main(String[] args) {
        even e=new even();
        Thread t=new Thread(e);
        t.start();
    }
}

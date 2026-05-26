public class methodOver {
   public int a=10;
   public int b=20,c;
   public char d;

    void  add()
    {
        c=a+b;
    }
    void add(int a)
    {
        System.out.println("the number is"+a);
    }
    void add(int x,char y)
    {
        a=x;
        d=y;
    }

    public static void main(String[] args) {
        methodOver m=new methodOver();
        m.add(100);
        m.add();
        m.add(12,'s');
    }
}

package p1;

public class B {


         int num1 = 10;
        int num2 = 20;
        int num;
       public void cal()
       {
           num=num1+num2;
       }
      public void show()
       {
           System.out.println(num);
       }

    public static void main(String[] args) {
        B b=new B();
        b.cal();
        b.show();
    }
}

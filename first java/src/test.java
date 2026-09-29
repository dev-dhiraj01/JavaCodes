// use of packeges
import p1.classA;
import p2.classB;
public class test {
    int m=30;
    void showt()
    {
        System.out.println("class test m="+m);
    }

    public static void main(String[] args) {
        classA a=new classA();
        a.showA();
        classB b=new classB();
        b.showB();
        test t=new test();
        t.showt();

    }
}

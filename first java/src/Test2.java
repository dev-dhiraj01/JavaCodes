import p1.A;
import p2.B;

public class Test2 {
    public void showT() {
        System.out.println("This is method showT() from class Test");
    }

    public static void main(String[] args) {
        A a = new A();
        a.showA();

        B b = new B();
        b.showB();

        Test2 test = new Test2();
        test.showT();
    }
}


// class Test2 {
//     // private int Num;
//     // void setValue() {
//     // Num = 10;
//     // System.out.println(Num);
//     // }

//     public void show() {
//         System.out.println("in show");
//     }
// }

// class Test3 extends Test2 {

//     public void show() {
//         System.out.println("in show33");
//     }

//     public void show2() {
//         System.out.println("in show3");
//     }
// }
class thread1 implements Runnable {
    int num = 0;
    public void run() {
        for (int i = 0; i <= 10; i++) {
            num++;
            System.out.println(num);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void show(){
        System.out.println("name");
    }
}

class thread2 extends Thread  {
    public void run() {
        int num = 0;
        for (int i = 0; i <= 10; i++) {
            num--;
            System.out.println(num);
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void show() {
        System.out.println("name");
    }
}

class InnerTest2 {
    public static void main(String[] args) {

        // Test2 obj = new Test3();
        // obj.show();
        // Test3 obj2 = (Test3)obj;
        // obj2.show2();
        thread1 obj1 = new thread1();
        Thread t1 = new Thread(obj1);
        thread2 t2 = new thread2();

        t1.start();
        obj1.show();
        t2.start();
        t2.show();


    }

}

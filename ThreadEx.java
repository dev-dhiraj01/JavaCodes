class thread1 implements Runnable { //using Runnable Interface 
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

    public void show() {
        System.out.println("name");
    }
}

class thread2 extends Thread {      //By Extending Thread Class
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

class ThreadEx {
    public static void main(String[] args) {

        // thread1 obj1 = new thread1();
        // Thread t1 = new Thread(obj1);
        // thread2 t2 = new thread2();

        // t1.start();
        // obj1.show();
        // t2.start();
        // t2.show();
        int i = 100;
        double d = i;
        System.out.println(d);
        System.out.println(i);

    }

}

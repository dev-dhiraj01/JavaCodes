package p1;

public class NewONe {
    // The Process of Child thread With Main
// Example 1 :

    class MyThread extends Thread {
        public MyThread(String name) {
            super(name);
        }
        public void run() {
            // Define the behavior of the thread
        }
    }
    class NewChild1 extends MultiThread.MyThread {
        public NewChild1(String name) {
            super(name);
            start();
        }

        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + "=" + i);
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception = " + e);
            }
        }
    }

}

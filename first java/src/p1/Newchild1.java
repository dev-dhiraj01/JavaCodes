//package p1;
//
//    public class Newchild1 {
//        public static <NewThread> void main(String[] args) {
//            NewThread N1 = new NewThread("Child Thread");
//            NewThread N2 = new NewThread("Child Thread");
//            for (int i = 1; i <= 10; i++) {
//                System.out.println("Main Thread = " + i);
//                try {
//                    Thread.sleep(1000);
//                } catch (Exception e) {
//                    System.out.println("Exception = " + e);
//                }
//            }
//
//        }
//    }

package p1;

public class Newchild1 {
    public static void main(String[] args) {
        Thread N1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child Thread 1 = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Exception in child thread 1 = " + e);
                }
            }
        }, "Child Thread 1");

        Thread N2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child Thread 2 = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Exception in child thread 2 = " + e);
                }
            }
        }, "Child Thread 2");

        N1.start();
        N2.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread = " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Exception in main thread = " + e);
            }
        }
    }
}

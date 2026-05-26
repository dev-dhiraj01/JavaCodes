// class counter {
//     int count;

//     public synchronized void increment() {
//         count++;
//     }
// }
// class call extends counter{

// }

// public class Racecondition {
//     public static void main(String[] args) throws InterruptedException {
//         counter c = new counter();

//         Runnable obj1 = () -> {
//             for (int i = 0; i < 10000; i++) {
//                 c.increment();
//             }
//         };
//         Runnable obj2 = () -> {
//             for (int i = 0; i < 10000; i++) {
//                 c.increment();
//             }
//         };

//         Thread t1 = new Thread(obj1);
//         Thread t2 = new Thread(obj2);

//         t1.start();
//         t2.start();

//         t1.join();
//         t2.join();
//         System.out.println(c.count);
//     }
// }


class Counter {
    int count = 0; // Shared variable

    public synchronized void increment() { // Synchronization to avoid race condition
        count++;
    }
}

class IncrementTask implements Runnable {
    private Counter counter; // Reference to shared Counter object

    public IncrementTask(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}

class Racecondition {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        IncrementTask task1 = new IncrementTask(c);
        IncrementTask task2 = new IncrementTask(c);

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + c.count);
    }
}

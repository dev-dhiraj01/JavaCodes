import java.util.PriorityQueue;
import java.util.Scanner;

class Task implements Comparable<Task> {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }


    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }


    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        System.out.print("Enter the number of tasks: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter task name: ");
            String name = scanner.nextLine();

            System.out.print("Enter task priority (lower number = higher priority): ");
            int priority = scanner.nextInt();
            scanner.nextLine(); 

            taskQueue.add(new Task(name, priority));
        }

        System.out.println("\nProcessing tasks by priority:");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Executing: " + task);
        }

        scanner.close();
    }
}

import java.util.PriorityQueue;
import java.util.Scanner;


class Alert implements Comparable<Alert> {
    int severity;
    String message;

    public Alert(int severity, String message) {
        this.severity = severity;
        this.message = message;
    }

    @Override
    public int compareTo(Alert other) {
        return Integer.compare(this.severity, other.severity); 
    }

    @Override
    public String toString() {
        return "[Severity: " + severity + "] " + message;
    }
}

public class RealTimeAlertSystem {
    public static void main(String[] args) {
        PriorityQueue<Alert> alertQueue = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Real-Time Alert System ===");
        System.out.print("How many alerts would you like to input? ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter alert message: ");
            String msg = scanner.nextLine();
            System.out.print("Enter severity (1=Critical, 5=Info): ");
            int severity = scanner.nextInt();
            scanner.nextLine(); 

            alertQueue.add(new Alert(severity, msg));
        }

        System.out.println("\n=== Processing Alerts by Priority ===");
        while (!alertQueue.isEmpty()) {
            Alert alert = alertQueue.poll();
            System.out.println("ALERT: " + alert);
        }

        scanner.close();
    }
}

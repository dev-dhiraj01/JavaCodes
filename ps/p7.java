import java.util.Scanner;

// Custom Exception Class
class InvalidRideException extends Exception {
    public InvalidRideException(String message) {
        super(message);
    }
}

public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu for Ride selection
        System.out.println("Select Ride:");
        System.out.println("1. Car");
        System.out.println("2. Boat");
        System.out.print("Enter choice: ");
        int rideChoice = sc.nextInt();

        // Menu for Location selection
        System.out.println("\nSelect Location:");
        System.out.println("1. Land");
        System.out.println("2. Water");
        System.out.print("Enter choice: ");
        int locationChoice = sc.nextInt();

        String ride = (rideChoice == 1) ? "Car" : "Boat";
        String location = (locationChoice == 1) ? "Land" : "Water";

        try {
            // Condition to throw exceptions
            if (ride.equals("Car") && location.equals("Water")) {
                throw new InvalidRideException("Error: Car cannot be driven on Water!");
            } else if (ride.equals("Boat") && location.equals("Land")) {
                throw new InvalidRideException("Error: Boat cannot be ridden on Land!");
            } else {
                System.out.println("\nYou are riding a " + ride + " on " + location + ".");
            }
        } catch (InvalidRideException e) {
            System.out.println("\n" + e.getMessage());
        }

        sc.close();
    }
}

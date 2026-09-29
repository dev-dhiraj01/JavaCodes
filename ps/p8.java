import java.util.ArrayList;
import java.util.Scanner;

public class p8 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Adding elements to ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Initial ArrayList: " + names);

        // Adding user input to ArrayList
        System.out.print("Enter a name to add: ");
        String newName = sc.nextLine();
        names.add(newName);

        // Display updated list
        System.out.println("\nUpdated ArrayList: " + names);

        // Removing an element
        System.out.print("Enter a name to remove: ");
        String removeName = sc.nextLine();
        if (names.remove(removeName)) {
            System.out.println(removeName + " removed successfully.");
        } else {
            System.out.println(removeName + " not found in list.");
        }

        // Final list
        System.out.println("\nFinal ArrayList: " + names);

        sc.close();
    }
}

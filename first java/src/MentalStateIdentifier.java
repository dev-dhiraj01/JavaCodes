import java.util.Scanner;

public class MentalStateIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define your questionnaire questions
        String[] questions = {
                "How often do you feel stressed? (1 - Not at all, 5 - Extremely)",
                "Do you often have trouble sleeping? (1 - Never, 5 - Always)",
                // Add more questions here...
        };

        int totalScore = 0;

        // Ask each question and calculate the total score
        for (String question : questions) {
            System.out.println(question);
            int response = scanner.nextInt();
            totalScore += response;
        }

        // Determine the mental state based on the total score
        String mentalState = determineMentalState(totalScore);

        // Display the result to the user
        System.out.println("Your mental state is: " + mentalState);

        // Close the scanner
        scanner.close();
    }

    // Define a method to determine mental state based on the total score
    private static String determineMentalState(int totalScore) {
        if (totalScore <= 10) {
            return "Low stress level";
        } else if (totalScore <= 20) {
            return "Moderate stress level";
        } else {
            return "High stress level";
        }
    }
}

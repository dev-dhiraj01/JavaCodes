import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        System.out.println("Dhiraj v chaudhari 2207804");
        String filename = "example.txt";

        // Write some text to the file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, world!\n");
            writer.write("This is an example of file I/O.\n");
        } catch (IOException e) {
            System.err.println("Error writing to file.");
        }

        // Read the text from the file
        try (FileReader reader = new FileReader(filename)) {
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file.");
        }
    }
}

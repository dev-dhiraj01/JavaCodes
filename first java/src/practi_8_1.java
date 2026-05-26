//import java.io.*;
//
//public class FileStream {
//    public static void main(String[] args) {
//        String inputFilename = "example.txt";
//        String outputFilename = "output.txt";
//
//        // Read from input file and write to output file
//        try (InputStream inputStream = new FileInputStream(inputFilename);
//             OutputStream outputStream = new FileOutputStream(outputFilename)) {
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = inputStream.read(buffer)) != -1) {
//                outputStream.write(buffer, 0, bytesRead);
//            }
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//        }
//
//        // Read from output file and print to console
//        try (InputStream inputStream = new FileInputStream(outputFilename)) {
//            byte[] buffer = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = inputStream.read(buffer)) != -1) {
//                System.out.print(new String(buffer, 0, bytesRead));
//            }
//        } catch (IOException e) {
//            System.err.println("Error: " + e.getMessage());
//        }
//    }
//}

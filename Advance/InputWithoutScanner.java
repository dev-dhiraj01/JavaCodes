
// 1. Using BufferedReader — recommended for learning
import java.io.*;

public class InputWithoutScanner {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String name = br.readLine();

        System.out.print("Enter your age: ");
        
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }
}


// 2. Using System.in.read()
// public class Main {
//     public static void main(String[] args) throws Exception {

//         System.out.print("Enter a character: ");

//         int ch = System.in.read();

//         System.out.println("You entered: " + (char) ch);
//     }
// }


// 3. Using BufferedInputStream
// import java.io.*;

// public class Main {
//     public static void main(String[] args) throws Exception {

//         BufferedInputStream input =
//             new BufferedInputStream(System.in);

//         int ch = input.read();

//         System.out.println((char) ch);
//     }
// }
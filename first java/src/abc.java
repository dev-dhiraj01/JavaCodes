//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
//
////////public class abc {
////////    public static void main(String[] args) {
////////        int a=10;
////////        int b=20;
////////        int c;
//////////        c=a+b;
////////
////////        System.out.println(a>=b);
////////        System.out.println(a<=b);
////////
////////        int number = 10;
////////        String result = (number % 2 == 0) ? "Even" : "Odd";
////////        System.out.println("The number is: " + number);
////////        System.out.println("The number is " + result);
////////
////////
////////    }
////////}
//////public class abc {
//////    public static void main(String[] args) {
//////        MyObject obj1 = new MyObject();
//////        MyObject obj2 = new MyObject();
//////
//////        obj1 = null; // Making obj1 eligible for garbage collection
//////        obj2 = null; // Making obj2 eligible for garbage collection
//////
//////        // Requesting garbage collection explicitly
//////        System.gc();
//////    }
//////}
//////
//////class MyObject {
//////    // Constructor
//////    public MyObject() {
//////        System.out.println("MyObject created");
//////    }
//////
//////    // Overriding the finalize() method for cleanup
//////    @Override
//////    protected void finalize() throws Throwable {
//////        try {
//////            System.out.println("Finalize method called");
//////            // Perform cleanup operations here
//////        } finally {
//////            // Calling the finalize() method of the superclass
//////            super.finalize();
//////        }
//////    }
//////}
////class OverloadDemo
////{
////    void area(float x)
////    {
////        System.out.println("the area of the square is "+x*x);
////    }
////    void area(float x, float y)
////    {
////        System.out.println("the area of the rectangle is "+x*y);
////    }
////    void area(double x)
////    {
//////        double z = 3.14 * x * x;
////        System.out.println("the area of the circle is "+ 3.14 * x * x);
////    }
////}
////class abc
////{
////    public static void main(String args[])
////    {
////        OverloadDemo ob = new OverloadDemo();
////        ob.area(5);
////        ob.area(5,5);
////        ob.area(5.5);
////    }
////}
//class college2{
//    String cname ;
//    int ccode;
//    public void cgdata()
//    {
//        Scanner s=new Scanner(System.in);
//        cname =s.nextLine();
//        ccode=s.nextInt();
//    }
//    public void csdata()
//    {
//        System.out.println("the data is "+cname+" "+ccode);
//    }
//
//}
//class dept extends college2
//{
//    String dname ;
//    int dcode;
//    public void dgdata()
//    {
//        Scanner s=new Scanner(System.in);
//        dname =s.nextLine();
//        dcode=s.nextInt();
//    }
//    public void dsdata()
//    {
//        System.out.println("the data is "+dname+" "+dcode);
//    }
//
//}
//class student extends dept
//{
//    String sname ;
//    int rno;
//    public void sgdata()
//    {
//        Scanner s=new Scanner(System.in);
//        sname =s.nextLine();
//        rno=s.nextInt();
//    }
//    public void ssdata()
//    {
//        System.out.println("the data is "+sname+" "+rno);
//    }
//
//    public static void main(String[] args) {
//        student s=new student();
//        s.cgdata();
//        s.csdata();
//        s.dgdata();
//        s.dsdata();
//        s.sgdata();
//        s.ssdata();
//    }
//}
////class abc{
////    public static void main(String[] args) {
////
////        college2 c=new college2();
////        c.cgdata();
////        c.csdata();
////    }
////}
//class abc {
//    public static void main(String[] dateValidation) {
//        Scanner kb = new Scanner(System.in);
//        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
//        sdf.setLenient(false);
//        System.out.println("Please enter a date (mm/dd/yyyy)");
//        String uDate = kb.nextLine();
//        try {
//            sdf.parse(uDate);
//            System.out.println(uDate + " is a valid Date");
//        } catch (Exception e) {
//            System.out.println(uDate + " is not a valid Date");
//        }
//        kb.close();
//    }
//}
//    class abc
//{
//    public static void main(String[] args) throws IOException {
//        File fin=new File("C:\\Users\\Dhiraj\\IdeaProjects\first java\src\\Bankdoc.txt");
//        File fout=new File("C:\\Users\\Dhiraj\\IdeaProjects\\first java\\src\\BankHis.txt");
//        FileReader f1 =new FileReader(fin);
//        FileReader f2 =new FileReader(fout);
//        int i;
//        while ((i=f1.read())!=-1)
//        {
//            f2.wri(i);
//        }
//
//    }
//}
//import java.io.*;
//
//public class abc {
//    public static void main(String[] args) {
//        String source= "C:\\Users\\Dhiraj\\IdeaProjects\\first java\\src\\Bankdoc.txt";   // Update with the actual source file path
//        String destination = "C:\\Users\\Dhiraj\\IdeaProjects\\first java\\src\\BankHis.txt";   // Update with the actual destination file path
//
//        try {
//            File fin = new File(source);
//            File fout = new File(destination);
//
//            FileReader read = new FileReader(fin);
//            FileWriter write = new FileWriter(fout);
//
//            int ch;
//            while ((ch = read.read()) != -1) {
//                write.write(ch);
//            }
//
//            read.close();
//            write.close();
//
//            System.out.println("File copied successfully.");
//        } catch (IOException e) {
//            System.out.println("An error occurred while copying the file: " + e.getMessage());
//        }
//    }
//}
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.stream.Stream;
//
//public class abc {
//    public static void main(String[] args) {
//        String filename = "C:\\Users\\Dhiraj\\IdeaProjects\\first java\\src\\Bankdoc.txt"; // Update with the actual file path
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
//            long wordCount = reader.lines()
//                    .flatMap(line -> Stream.of(line.split("\\s+")))
//                    .filter(word -> !word.isEmpty())
//                    .count();
//
//            System.out.println("Number of words in the file: " + wordCount);
//        } catch (IOException e) {
//            System.out.println("An error occurred while reading the file: " + e.getMessage());
//        }
//    }
//}
//import java.io.IOException;
//import java.io.PrintWriter;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class MyServlet extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        // Get information from the request
//        String name = request.getParameter("name");
//
//        // Process the request and generate the response
//        String greeting = "Hello, " + name + "!";
//
//        // Set the response content type
//        response.setContentType("text/html");
//
//        // Get the PrintWriter object to write the response
//        PrintWriter out = response.getWriter();
//
//        // Generate the response HTML
//        out.println("<html>");
//        out.println("<head><title>Greeting</title></head>");
//        out.println("<body>");
//        out.println("<h1>" + greeting + "</h1>");
//        out.println("</body>");
//        out.println("</html>");
//    }
//}
//class A {
//    int a;
//    int b;
//
//    A() {
//        a = 0;
//        b = 0;
//    }
//
//    A(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//}
//
//class B extends A {
//    int c;
//
//    B() {
//        super();
//        c = 0;
//    }
//
//    B(int a, int b, int c) {
//        super(a, b);
//        this.c = c;
//    }
//
//    void add() {
//        int result = a + b + c;
//        System.out.println("Result: " + result);
//    }
//}
//
//public class abc {
//    public static void main(String[] args) {
//        B obj = new B(2, 3, 4);
//        obj.add(); // Output: Result: 9
//    }
//}

class abc {
    public static void main(String[] args) {

        for (int i=0;i<5;i++){
            for (int j=0;j<i+1;j++)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        for (int i=5;i>0;i--){
            for (int j=i-1;j>0;j--)
            {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}
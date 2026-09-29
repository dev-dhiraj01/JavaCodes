import java.util.Scanner;

// constructor
// class Student {
//     private int rn;
//     private String name;

//     public Student(){   //default constructor
//         rn = 1234;
//         name = "Dhiraj";
//     }

//     public Student(int rn, String name){    //parameterized constructor
//        this.rn = rn;
//         this.name = name;
//     }

//     public Student(Student b){      //copy constructor
//         rn = b.rn;
//         name = b.name;
//     }
//     public void display(){
//         System.out.println("roll No :" + rn +"\n name :" + name);
//     }
//     //put the below inside the main function
//         //     Student s1 = new Student();
//         // Student s2 = new Student(10,"vinod");
//         // Student s3 = new Student(s2);

//         // s1.display();
//         // s2.display();
//         // s3.display();
// }
class Test  {
    int age ;
    private String name;
    protected int sal ;

        

        
    public Test(){
        System.out.println(age);
    }
    
   public Test(int a){

    System.out.println(a);
    }
    public void set(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void get(){
       
        System.out.println(age + " : " + name);
    }
}
public class base {

    public static void main(String args[]) {
       int age ;
        age = 10;
        System.out.println("age is " + age);
        Test obj = new Test();
        // Test obj1 = new Test(10);
        // obj.sal = 44;
        // obj.set(23,"Dhiraj");
        // obj.get();
        // System.out.println(obj.sal);
    // static void display() {
    //     System.out.println("inside the function");
    //     for (int i = 0; i < 3; i++) {
    //         System.out.println(i);
    //         // return;
    //     }
    // }
    // static int fact(int n){
    //     int ans = n;
    //     if(n == 1){
    //         return 1;
    //     }
    //    return ans * fact(n-1);
    // }
    //     Scanner s = new Scanner(System.in);
    //     int num = s.nextInt();

    //    int ans = fact(num);
    //    System.out.println("ans is :" + ans);
    //    s.close();
    //     System.out.println("inside the main");
    //     display();
    //     System.out.println("after the function");

    //     char ch[] = new char[] {'D', 'H', 'I', 'R', 'A', 'J'};
    //     for(int i = 0; i < 6; i++){
    //         System.out.println(ch[i]);
    //     }

    //     String st = "Dhiraj";
    //     int hash = System.identityHashCode(st);
    //     System.out.println(hash);

    //     st = st + " Vinod";
    //     int hash1 = System.identityHashCode(st);
    //     System.out.println(hash1);
    //     System.out.println(st);

        // String st1 = "Dhiraj";
        // int hash2 = System.identityHashCode(st1);
        // System.out.println(hash2);
        // int num;
        
        // System.out.println("enter a number :");
        // Scanner s = new Scanner(System.in);
        // num = s.nextInt();
        // System.out.println(num);
        // s.close();

        // int d1,d2;
    /*       
         float fl = 10.50f;
        double d = 293847d;
    */
    // byte b ;
    // char a = 56;
    // b = (byte)a;
    // System.out.println(a+"a");    
    
    // Scanner s = new Scanner(System.in);
    // System.out.println("enter a number: ");
    // int a = s.nextInt();
    // System.out.println("the value which is taken as input is: " + a);

    // s.close();
    // d1 = 1000_0000_0;
    // d2 = 20;
    // System.out.println(d1+d2);

    // //type conversion in java
    //     float f = 5.6f;
    //     int x = (int)f;
    //     System.out.println(x);

        //Command line Arguments
        // System.out.println(args[0]);
        // System.out.println(args[1]);

        //Turnary operator
        // int age = 18;
        // String result = (age > 18) ? "True" : "False"; 
        // System.out.println(result);

    }

}

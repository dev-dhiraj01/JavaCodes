import java.util.Scanner;

//can a static method be override 
//can we create an objec of a class 
//solve problem no 387,875
//longest common prefix
//we need to create default default construnctor if we create a prameterized construnctor

class a {
    static void nn(int n){
        System.out.println("hello");
    }

    static void nn(int n , int m){
        System.out.println("second");
    }
}
public class Test extends a {

    static void nn(){
        System.out.println("hey");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student age");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("enter student Name");
        String name = sc.nextLine();

        System.out.println(age+" "+ name);

        sc.close();
        Test t = new Test();
        t.nn(10,20);
    }
}
 
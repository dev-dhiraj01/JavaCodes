
class Student {
    int rollNumber;
    String name;

    // Default Constructor
    public Student() {
        rollNumber = 0;
        name = "Unknown";
    }

    // Parameterized Constructor
    public Student(int r, String n) {
        rollNumber = r;
        name = n;
    }

    // Copy Constructor
    public Student(Student student) {
        rollNumber = student.rollNumber;
        name = student.name;
    }

    void display() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
    }

}

 public class ese {

        public static void main(String[] args) {

            Student obj = new Student();
            obj.display();

            Student obj1 = new Student(11, "Dhiraj");
            obj1.display();

            Student obj2 = new Student(obj1);
            obj2.display();

        }
    }
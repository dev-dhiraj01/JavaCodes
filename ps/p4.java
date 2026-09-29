class Employee {
    // Data members
    private String name;
    private int id;
    private String department;
    private double salary;

    // Default Constructor
    public Employee() {
        name = "Unknown";
        id = 0;
        department = "Not Assigned";
        salary = 0.0;
    }

    // Parameterized Constructor (name, id)
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.department = "General";
        this.salary = 30000.0;
    }

    // Parameterized Constructor (name, id, department, salary)
    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    // Method to display employee details (no arguments)
    public void displayDetails() {
        System.out.println("\nEmployee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }

    // Method Overloading: Display with custom message
    public void displayDetails(String message) {
        System.out.println("\n" + message);
        displayDetails(); // Calling normal displayDetails()
    }
}

 public class p4 {
    public static void main(String[] args) {
        // Using default constructor
        Employee e1 = new Employee();

        // Using parameterized constructor (2 parameters)
        Employee e2 = new Employee("Alice", 102);

        // Using parameterized constructor (4 parameters)
        Employee e3 = new Employee("Bob", 103, "IT", 55000);

        // Displaying details using method overloading
        e1.displayDetails("Employee 1 Details:");
        e2.displayDetails("Employee 2 Details:");
        e3.displayDetails("Employee 3 Details:");
    }
}

// Base Class: Employee
class Employee {
    protected int empId;
    protected String name;
    protected double basicSalary;

    public Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: ₹" + basicSalary);
    }

    // Method to calculate salary (overridden in subclasses)
    public double calculateSalary() {
        return basicSalary;
    }
}

// Derived Class: Regular Employee
class RegularEmployee extends Employee {
    private double hra;
    private double da;

    public RegularEmployee(int empId, String name, double basicSalary, double hra, double da) {
        super(empId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + hra + da;
    }
}

// Derived Class: Part-Time Employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(int empId, String name, int hoursWorked, double ratePerHour) {
        super(empId, name, 0); // Basic Salary not used
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}

// Main Class to generate Pay Slip
public class p5 {
    public static void main(String[] args) {
        // Regular Employee
        RegularEmployee regEmp = new RegularEmployee(101, "Alice", 30000, 5000, 3000);
        System.out.println("\nRegular Employee Pay Slip:");
        regEmp.displayDetails();
        System.out.println("Total Salary: ₹" + regEmp.calculateSalary());

        // Part-Time Employee
        PartTimeEmployee partEmp = new PartTimeEmployee(102, "Bob", 120, 150);
        System.out.println("\nPart-Time Employee Pay Slip:");
        partEmp.displayDetails();
        System.out.println("Total Salary: ₹" + partEmp.calculateSalary());
    }
}

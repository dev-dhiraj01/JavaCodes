// import java.util.Comparable;
import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Employee that) {
        return Integer.compare(this.id, that.id);
    }
}

class Example {
    public static void main(String args[]) {
        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(55, "Dhiraj"));
        list.add(new Employee(15, "Pranav"));
        list.add(new Employee(25, "sanchit"));

        Collections.sort(list);

        for (Employee e : list) {
            System.out.println(e.id + " " + e.name);
        }

    }
}
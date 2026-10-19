import java.util.*;

class Student1 implements Comparable<Student1> {
    int id;
    String name;
    int age;

    Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student1 that) {
        if(this.age == that.age){
           return this.name.compareTo(that.name);
        }
        return Integer.compare(this.age ,that.age);
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Student1> list = new ArrayList<>();

        list.add(new Student1(103, "Amit",22));
        list.add(new Student1(101, "Dhiraj",22));
        list.add(new Student1(102, "Rahul",25));
        list.add(new Student1(105,"Pranav",56));

        Collections.sort(list);

        for (Student1 s : list) {
            System.out.println(s.id + " " + s.name+" "+s.age);
        }

    }
}
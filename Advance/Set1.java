                //                                      Set
                //                                       |
                //     -------------------------------------------------------------------
                //     |           |                                       |             |
                // EnumSet     HashSet                               LinkedHashSet   TreeSet
//                             do not preserv order             preserves order      stores in ascending order
// import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

class Student{

    int roll;
    String name;
    public Student(int roll, String name){
        this.name = name;
        this.roll = roll;
    }
}
public class Set1 {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        Student st = new Student(123,"dhiraj");
        System.out.println(st.roll+ " " + st.name);
        set.add(10);
        set.add(40);
        set.add(40);
        set.add(50);
        System.out.println(set);
    }
}

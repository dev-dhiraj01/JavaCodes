import java.util.*;

class Students {
    int id;
    String name;

    Students(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Students> list = new ArrayList<>();

        list.add(new Students(103, "Amit"));
        list.add(new Students(101, "Dhiraj"));
        list.add(new Students(102, "Rahul"));
        list.add(new Students(100, "Sanket"));

        // Comparator<Students> byName = (s1, s2) ->
        // s1.name.compareTo(s2.name);

        // list.sort(byName);

        // Collections.sort(list, new Comparator<Students>() {
        //     @Override
        //     public int compare(Students s1, Students s2) {
        //         return s1.name.compareTo(s2.name);
        //     }
        // });

        // lambda Expression of the above code both works same
        // to compare the names
        Collections.sort(list, (s1, s2) -> s1.name.compareTo(s2.name));

        // to compare the ID
        // Collections.sort(list,( s1, s2) -> Integer.compare(s1.id ,s2.id));

        // shortCut to compare Integer value
        // list.sort((a,b) ->
        // Integer.compare(a.id, b.id));

        for (Students s : list) {
            System.out.println(s.id + " " + s.name);
        }
    }
}
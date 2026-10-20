import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Result {
    public static void main(String args[]) {

        List<ClgStudent> results = new ArrayList<>();

        results.add(new ClgStudent(101, "Dhiraj", 85, 75, 96, 83, 78));
        results.add(new ClgStudent(102, "Pranav", 85, 69, 96, 93, 68));
        results.add(new ClgStudent(103, "Sanket", 65, 85, 96, 43, 68));
        results.add(new ClgStudent(104, "Sanchit", 55, 95, 96, 83, 78));
        results.add(new ClgStudent(105, "Anchit", 55, 95, 96, 83, 78));

        Collections.sort(results, new Comparator<ClgStudent>() {
            @Override
            public int compare(ClgStudent s1, ClgStudent s2) {
                if(s1.total == s2.total){
                    return s1.name.compareTo(s2.name);
                }

                return Integer.compare((int) s2.total, (int) s1.total);
            }
        });

        for (ClgStudent result : results) {
            System.out.println(result.roll + " " + result.name + " " + result.total);
        }
    }
}
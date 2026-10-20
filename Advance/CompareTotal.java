import java.util.Comparator;

class CompareTotal implements Comparator<ClgStudent> {
    @Override
    public int compare(ClgStudent s1, ClgStudent s2) {
        if (s1.total == s2.total) {
            return s1.name.compareTo(s2.name);
        }

        return Integer.compare((int) s2.total, (int) s1.total);
    }
}
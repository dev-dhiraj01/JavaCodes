import java.util.Arrays;
import java.util.Comparator;

class ReverseComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer a, Integer b){
        return Integer.compare(b,a);
    }
}
public class DescendingArrUsingComparator {
    public static void main(String[] args) {
                Integer[] arr = {9,8,3,2,6,5,7};
        Arrays.sort(arr,new ReverseComparator());

        for(int i : arr){
            System.out.print(i +" ");
        }
        
    }
}

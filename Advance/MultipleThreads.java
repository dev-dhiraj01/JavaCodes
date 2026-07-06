import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

class MultipleThreads{

    public static void main(String args[]){
        int size = 1_0;

        List<Integer> nums = new ArrayList<>(size);

        Random ran = new Random();

        for(int i = 1; i <= size; i++){
            nums.add(ran.nextInt(100));
        }

        System.out.println(nums);

        long currstr = System.currentTimeMillis();
        int sum = nums.stream()
                        .map(i -> i*2)
                        .reduce(0,(c,e) -> c+e);

        long endstr = System.currentTimeMillis();

        System.out.println(sum);
        System.out.println("The time required is : "+ ( endstr - currstr));
    }
}
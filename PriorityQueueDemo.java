import java.util.HashMap;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
    PriorityQueue<Integer> p = new PriorityQueue<>();
    HashMap <String, Integer> hs = new HashMap<>();
    hs.put("Dhiraj", 95);
    hs.put("Shravan", 85);
    hs.put("Pranav", 75);
    p.add(40);
    p.offer(60);
    p.add(30);
    p.offer(20);
    p.add(70);
    p.add(10);

    System.out.println("the elements of the map.."+hs);
    System.out.println("the elements of the pQueue.."+p);
    while(!p.isEmpty()){
        System.out.println(p.remove());
    }
}
}

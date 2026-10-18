import java.util.Stack;
// import java.util.Queue;
import java.util.LinkedList;
import java.util.*;

public class StlStack {
    
    public static void main(String[] args) {
     Stack<Integer> stack = new Stack<>(); 
     stack.add(10);  
     stack.add(20);  
     stack.add(30);  
     stack.add(40);
     System.out.println(stack.set(2,5));
     System.out.println(stack.get(2));
     System.out.println(stack); 
     Collections.sort(stack);
     System.out.println(stack); 
     System.out.println(stack.search(40));

     Queue<Integer> que = new LinkedList<>();
        que.add(10);    // returns exception if lement not added 
        que.offer(20); // returns false if element not added 
        que.add(30);
        System.out.println(que);
        que.remove();
        System.out.println(que);
        System.out.println(que.poll()); // removes and returns the front element
        System.out.println(que);

    }
}

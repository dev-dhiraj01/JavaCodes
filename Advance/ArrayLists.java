import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ArrayLists {
    
    public static void main(String args[]){
ArrayList <Integer> list = new ArrayList<>();
        
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);

    Iterator<Integer> iterator = list.iterator();

    while(iterator.hasNext()){
        System.out.println(iterator.next());
    }


    ArrayList<Integer> coll = new ArrayList<>();
    coll.add(50);
    coll.add(42);
    coll.add(45);
    coll.add(30);
    System.out.println(coll);

    Collections.sort(coll, Collections.reverseOrder());

    //Alternatives sorting methods
    // coll.sort(null);
    // coll.sort(Collections.reverseOrder());

    System.out.println(coll);

    System.out.println(coll.indexOf(42));
}

}
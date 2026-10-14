import java.util.ArrayList;
import java.util.Iterator;

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
}

}
import java.util.*;
public class vect {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("IT");
        v.addElement("is");
        v.addElement("hello");
        v.insertElementAt("AIML",2);
        v.add(2,"as");
        System.out.println(v);
        System.out.println("size of vector list is "+v.size());
    }
}
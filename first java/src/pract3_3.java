//Vector class
import  java.util.Vector;
public class pract3_3 {
    public static void main(String[] args) {
        Vector <String>v=new Vector<String>();
        v.add("java");
        v.add("is");
        v.add("good");
        v.add("language");

        System.out.println("vector element "+v);
        String element1=v.get(2);
        System.out.println("element at index 2 "+element1);
        v.remove(3);
        System.out.println("vector element after removing element at index 3 "+v);
        int size=v.size();
        System.out.println("size of vector "+size);
        v.clear();
        System.out.println("vector elements after clearing "+v);

    }
}

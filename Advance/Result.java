import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Animal{
        
    public void show(){
        System.out.println("hello 1");
    }
    public void bark(){}
}

class Dog extends Animal{

    public void bark(){
        System.out.println("hello 2");
    }
}
class Result {
    public static void main(String args[]) {
        Animal a = new Dog();
        a.bark();
        

        List<ClgStudent> results = new ArrayList<>();

        results.add(new ClgStudent(101, "Dhiraj", 85, 75, 96, 83, 78));
        results.add(new ClgStudent(102, "Pranav", 85, 69, 96, 93, 68));
        results.add(new ClgStudent(103, "Sanket", 65, 85, 96, 43, 68));
        results.add(new ClgStudent(104, "Sanchit", 55, 95, 96, 83, 78));
        results.add(new ClgStudent(105, "Anchit", 55, 95, 96, 83, 78));

        Collections.sort(results, new CompareTotal());
        // One line Solution for sorting
        // results.sort((a,b) -> Double.compare(a.total,b.total));
    
        for (ClgStudent result : results) {
            System.out.println(result.roll + " " + result.name + " " + result.total);
        }
    }
}
// class Student {
//     int rollNumber;
//     String name;

//     // Default Constructor
//     public Student() {
//         rollNumber = 0;
//         name = "Unknown";
//     }

//     // Parameterized Constructor
//     public Student(int rollNumber, String name) {
//         this.rollNumber = rollNumber;
//         this.name = name;
//     }

//     // Copy Constructor
//     public Student(Student student) {
//         rollNumber = student.rollNumber;
//         name = student.name;
//     }

//     void display() {
//         System.out.println("Roll Number: " + rollNumber + ", Name: " + name);
//     }
// }
//import java.util.*;
//class Main1{
// public static void main(String args[])
// {
//  ArrayList<String> list=new ArrayList<String>();//Creating arraylist
//  list.add("Ravi");//Adding object in arraylist
//  list.add("Vijay");
//  list.add("Ravi");
//  list.add("Ajay");
//  //Traversing list through Iterator
//  Iterator itr=list.iterator();
//  System.out.println(list);
// //  while(itr.hasNext()){
// //  System.out.println(itr.next());

// //  //for(String obj:al)
// //  //System.out.println(obj);
// //  }
// }
// }


// class Main12 {
//     //public static void main(String[] args) {
//         // Student obj = new Student();
//         // obj.display();

//         // Student obj1 = new Student(22,"Dhiraj");
//         // obj1.display();

//         // Student obj2 = new Student(obj1);
//         // obj2.display();
//     //}
// }

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(5);
        System.out.println("PriorityQueue: " + queue);
        // Accessing the head of the queue
        Integer head = queue.peek();
        System.out.println("Head of PriorityQueue: " + head);
        // Removing elements from the queue
        Integer removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("PriorityQueue after removal: " + queue);
    }
}

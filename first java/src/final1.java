class Parent {
    public void displayMessage() {
        System.out.println("This is a method in the Parent class");
    }
}

class Child extends Parent {
    // Override the displayMessage() method in the Parent class
    @Override
    public final void displayMessage() {
        System.out.println("This is an overridden method in the Child class");
    }
}

public class final1 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.displayMessage(); // Output: This is a method in the Parent class

        Child child = new Child();
        child.displayMessage(); // Output: This is an overridden method in the Child class
    }
}

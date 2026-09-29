// Parent Class
class Animal {
    public void eat() {
        System.out.println("Animal is eating...");
    }

    public void sleep() {
        System.out.println("Animal is sleeping...");
    }

    public void makeSound() {
        System.out.println("Animal makes a sound...");
    }
}

// Child Class: Dog
class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating bones...");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping in its kennel...");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

// Child Class: Cat
class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating fish...");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping on the couch...");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows: Meow Meow!");
    }
}

// Main Class
public class p6 {
    public static void main(String[] args) {
        // Superclass reference holding Dog object
        Animal myDog = new Dog();
        System.out.println("=== Dog Behavior ===");
        myDog.eat();
        myDog.sleep();
        myDog.makeSound();

        // Superclass reference holding Cat object
        Animal myCat = new Cat();
        System.out.println("\n=== Cat Behavior ===");
        myCat.eat();
        myCat.sleep();
        myCat.makeSound();
    }
}

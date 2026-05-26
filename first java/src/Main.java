import java.util.Random;
import java.util.Scanner;

class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving " + brand + " " + model + "...");
    }

    public void stop() {
        System.out.println("Stopping " + brand + " " + model + "...");
    }
}

class Car extends Vehicle {

    public Car(String brand, String model, int year, int numSeats) {
        super(brand, model, year);
    }

    public void honk() {
        System.out.println("Honking the horn of " + brand + " " + model + "...");
    }
}

class Bike extends Vehicle {

    public Bike(String brand, String model, int year, boolean hasBasket) {
        super(brand, model, year);
    }

    public void ringBell() {
        System.out.println("Ringing the bell of " + brand + " " + model + "...");
    }
}

class DrivingException extends Exception {
    public DrivingException(String message) {
        super(message);
    }
}

class CarThread implements Runnable {
    private final Car car;

    public CarThread(Car car) {
        this.car = car;
    }

    @Override
    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                car.drive();
                if (rand.nextInt(10) < 2) {
                    throw new DrivingException("Crashed the car!");
                }
                Thread.sleep(2000);
                car.stop();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        } catch (DrivingException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the brand of the car: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the model of the car: ");
        String model = scanner.nextLine();

        System.out.print("Enter the year of the car: ");
        int year = scanner.nextInt();

        System.out.print("Enter the number of seats in the car: ");
        int numSeats = scanner.nextInt();

        Car car = new Car(brand, model, year, numSeats);
        Bike bike = new Bike("Schwinn", "Cruiser", 2021, true);

        car.honk();
        bike.ringBell();

        CarThread carThread = new CarThread(car);
        Thread thread = new Thread(carThread);
        thread.start();

        scanner.close();
    }
}

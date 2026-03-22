
public class ClassExample {
    public static void main(String[] args) {
        /*
         * PARADIGMS: Functional & OOP
         * OOP: Object Oriented Programming | class and object
         * OOP CONCEPTS: Abstraction, Encapsulation, Inheritance, Polimorphism
         */

        Car tesla = new Car("Tesla model 5", "White", 250); // class > object
        Car bmw = new Car("BMW M5", "black", 240);

        // state and method
        System.out.println("Car model:" + tesla.model);

        tesla.displayInfo();
        tesla.drive();

        bmw.displayInfo();
        bmw.drive();

        // tesla.info();
        Car.info();

        System.out.println("totalCarsBuilt: " + Car.totalCarsBuilt);

    }
}

// Car Class
class Car {
    // state property
    String model;
    String color;
    int maxSpeed;

    // static state
    static int totalCarsBuilt = 0;

    // consturctor
    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        totalCarsBuilt++;
    }

    // method property
    public void drive() {
        System.out.println(model + " is on the road...");
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Color: " + color + ", Max Speed: " + maxSpeed);
    }

    // static method
    public static void info() {
        System.out.println("This is the Car class blueprint.");
    }
}

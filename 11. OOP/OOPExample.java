
public class OOPExample {
    public static void main(String[] args) {
        /*
         * PARADIGMS: Functional & OOP
         * OOP: Object Oriented Programming | class and object
         * OOP CONCEPTS: Abstraction, Encapsulation, Inheritance, Polimorphism
         */

        // public, private, protected

        BankAccount account = new BankAccount("Justin", 2000);

        account.info();
        account.deposit(-1000);
        account.info();

        // account.owner = "John";

        // account.info();

        // System.out.println("Owner: " + account.owner);

        System.out.println("====== CAR CLASS =====");

        GasCar gasCar = new GasCar("Chevrolet Malibu", 60);
        ElectricCar electricCar = new ElectricCar("BYD", 71);

        gasCar.changeOil();
        gasCar.startEngine();

        electricCar.displayBatteryLevel();
        electricCar.startEngine();

        System.out.println("====== CAR CLASS =====");

    }
}

// PARENT CLASS
class Car {
    protected String model;
    protected int wheelsCount = 4;

    public Car(String model) {
        this.model = model;
    }

    public void startEngine() {
        System.out.printf("%s (with %d wheels) engine is starting: VROOM!\n", model, wheelsCount);
    }
}

// CHILD CLASS
class GasCar extends Car {
    private int tankSize;

    public GasCar(String model, int tankSize) {
        super(model);
        this.tankSize = tankSize;
    }

    public void changeOil() {
        System.out.printf("GasCar (%s): Changing engine oil. Fuel tank: %dL.\n", model, tankSize);
    }
}

class ElectricCar extends Car {
    private int batterySize;

    public ElectricCar(String model, int batterySize) {
        super(model);
        this.batterySize = batterySize;
    }

    public void displayBatteryLevel() {
        System.out.printf("ElectricCar (%s) Checking battery health. Capacity: %dkWh.\n", model, batterySize);
    }

    @Override
    public void startEngine() {
        System.err.printf("%s starts completely silently. No engine noise! \n", model);
    }
}

class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void info() {
        System.out.println("Owner: " + owner + ", balance: " + balance);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount entered!");
        }
    }
}

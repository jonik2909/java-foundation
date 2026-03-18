
public class Methods {

    public static void main(String[] args) {
        // METHODS
        // DEFINE & CALL
        // PARAMETR & ARGUMENT
        // VOID & RETURN

        // CALL - ARGUMENT
        sayHello("John");
        sayHello("Justin");

        // int returnValue = calculate(5, 10);
        // System.err.println("returnValue: " + returnValue);

        calculate(2, 2);
        calculate(2, 2, 4);

    }

    // DEFINE - PARAMETR
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    public static void calculate(int a, int b) {
        System.out.println("a + b: " + (a + b));
    }

    public static void calculate(int a, int b, int c) {
        System.out.println("a + b + c: " + (a + b + c));
    }
}

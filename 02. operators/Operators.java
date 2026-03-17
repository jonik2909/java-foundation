
public class Operators {
    public static void main(String[] args) {
        /*
         * Arithmetic Operators: +, -, *, /, %, ++, --
         * Assignment Operators: +=, -=, *=, /=
         * Comparison Operators: >, <, >=, <=, ==, !=
         * Logical Operators: &&, ||, !
         */

        System.out.println("===== Arithmetic Operators =====");
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // int c = 5;
        // c++; // c = c + 1
        // System.out.println("c: " + c);

        // c--; // c = c - 1
        // System.out.println("c: " + c);

        int c = 5;
        // int f = c++; // post-increment
        int f = ++c; // pre-increment

        System.out.println("c: " + c);
        System.out.println("f: " + f);

        System.out.println("===== Assignment Operators =====");
        // Assignment Operators: +=, -=, *=, /=
        int d = 10;
        d += 5; // d = d + 5;
        System.out.println("d += 5: " + d);

        d -= 5; // d = d - 5;
        System.out.println("d -= 5: " + d);

        d *= 5; // d = d * 5;
        System.out.println("d *= 5: " + d);

        d /= 5; // d = d / 5;
        System.out.println("d /= 5: " + d);

        System.out.println("===== Comparison Operators =====");
        // Comparison Operators: >, <, >=, <=, ==, !=
        int x = 10;
        int y = 20;
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));

        System.out.println("===== Logical Operators =====");
        // Logical Operators: &&, ||, !

        boolean condition1 = true;
        boolean condition2 = false;

        System.out.println("condition1 && condition2: " + (condition1 && condition2));
        System.out.println("condition1 || condition2: " + (condition1 || condition2));
        System.out.println("!condition1: " + (!condition1));

    }

}

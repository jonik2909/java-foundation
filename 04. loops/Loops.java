
public class Loops {
    public static void main(String[] args) {
        /*
         * LOOPS
         * - for loop
         * - while loop
         */

        System.out.println("===== FOR LOOP =====");

        System.out.println("START");
        for (int i = 1; i <= 2; i++) {
            System.out.println("i: " + i);
        }
        System.out.println("END");

        System.out.println("===== WHILE LOOP =====");
        int x = 100;
        while (x <= 10) {
            System.out.println("x: " + x);
            x++;
        }

        int i = 10;
        do {
            System.out.println("Executed");
        } while (i < 5);

        System.out.println("===== BREAK/CONTINUE =====");

        for (int y = 1; y <= 10; y++) {
            if (y == 5)
                continue; // skip
            if (y == 8)
                break; // stop
            System.out.println("y: " + y);
        }

    }
}

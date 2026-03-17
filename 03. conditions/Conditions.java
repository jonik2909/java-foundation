
public class Conditions {
    public static void main(String[] args) {
        // CONDITIONS
        // if, else if, else
        // ternary operator (Shorthand if-else)
        // switch

        System.out.println("===== IF CONDITION =====");

        int temperature = 10;

        if (temperature > 30) {
            System.out.println("The weather is very hot!");
        } else if (temperature >= 20) {
            System.out.println("The weather is warm!");
        } else {
            System.out.println("The weather is cold!");
        }

        System.out.println("===== NESTED IF =====");
        int n = 5;
        if (n > 0) {
            System.out.println("condition-1 executed!");
            if (n == 5) {
                System.out.println("condition-2 executed!");
            }
        }

        int age = 30;
        boolean isStudent = false;

        if (age > 25 || isStudent) {
            System.out.println("get your discount!");
        }

        System.out.println("===== TERNARY OPERATOR =====");
        int number = 10;
        // if (number % 2 == 0) {
        // System.out.println("even number");
        // } else {
        // System.out.println("odd number");
        // }

        String message = (number % 2 == 0) ? "even number" : "odd number";
        System.out.println(message);

        System.out.println("===== SWITCH =====");

        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            case 'F':
                System.out.println("Fail!");
                break;
            default:
                System.out.println("Invalid grade!");
        }
    }
}


public class StringExample {
    public static void main(String[] args) {
        /* STRING */
        String text = "Uzbekistan - a country with a great future";

        int length = text.length(); // CALL | RETURN

        System.out.println("length: " + length);
        System.out.println("uppercase: " + text.toUpperCase());
        System.out.println("uppercase: " + text.toLowerCase());
        System.out.println("trim: " + text.trim());

        System.out.println("charAt: " + text.charAt(11));
        System.out.println("substring: " + text.substring(5, 10));

        String email = "test@gmail.com";
        System.out.println("contains: " + email.contains("test1"));

        System.out.println("replace: " + text.replace("great", "powerful"));

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println("contact: " + firstName.concat(lastName));

        String s1 = "Java";
        String s2 = "java";
        System.out.println("equals: " + s1.equals(s2));
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));

        String username = "admin";
        String password = "admin123";

        if (username.equals("admin") && password.equals("admin123")) {
            System.out.println("Successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

        String emptyText = "";
        System.out.println("empty: " + emptyText.isEmpty());

        String name = "John";
        int age = 25;
        String formatText = String.format("My age is %d and My name is %s", age, name);
        System.out.println(formatText);

    }
}

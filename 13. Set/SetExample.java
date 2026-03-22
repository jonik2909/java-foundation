import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        /*
         * Set: unique value
         * 
         * add()
         * size(),
         * contains(), isEmpty()
         * remove(), clear()
         */

        System.out.println("====== ======");

        Set<String> emails = new HashSet<>();
        Set<Integer> nums = new HashSet<>();

        emails.add("justin@gmail.com");
        emails.add("john@gmail.com");
        emails.add("leo@gmail.com");

        nums.add(10);
        nums.add(1);
        nums.add(5);

        emails.remove("leo@gmail.com");
        // emails.clear();

        System.out.println("emails: " + emails);
        System.out.println("nums: " + nums);

        System.out.println("size: " + emails.size());
        System.out.println("contains: " + emails.contains("adam@gmail.com"));
        System.out.println("isEmpty: " + emails.isEmpty());

        System.out.println("====== ======");

    }
}

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        /*
         * MAP: key => value
         * 
         * keySet(), values(), size(), isEmpty()
         * put(), get(),
         * containsKey(), containsValue()
         * remove(), replace(), clear()
         */

        System.out.println("====== ======");

        Map<String, Integer> ages = new HashMap<>();

        ages.put("John", 25);
        ages.put("Justin", 28);
        ages.put("David", 32);
        ages.put("David", 25);

        ages.remove("John");
        ages.replace("Justin", 38);
        // ages.clear();

        System.out.println("ages: " + ages);
        System.out.println("keys: " + ages.keySet());
        System.out.println("values: " + ages.values());
        System.out.println("size: " + ages.size());
        System.out.println("isEmpty: " + ages.isEmpty());

        boolean containsKey = ages.containsKey("Justin");
        System.out.println("containsKey: " + containsKey);

        if (containsKey) {
            int element = ages.get("Justin");
            System.out.println("element: " + element);
        }

        boolean containsValue = ages.containsValue(28);
        System.out.println("containsValue: " + containsValue);

        System.out.println("====== ======");

    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /*
         * LIST: ArrayList & LinkedList
         * State & method
         * add(), get(), set(), remove(), size(), clear()
         * addAll(), contains(), isEmpty(), indexOf()
         * Collections.sort()
         * iteration methods: forEach, filter, map, reduce
         */

        List<String> names = new ArrayList<String>();
        List<Integer> numbers = new ArrayList<Integer>();

        // add()
        names.add("Alice");
        names.add("Bob");
        names.add("Leo");
        names.add("Justin");
        names.add(0, "John");

        numbers.add(10);
        numbers.add(1);
        numbers.add(50);
        numbers.add(20);

        System.out.println("names: " + names);

        // get()
        String element = names.get(4);
        System.out.println("element: " + element);

        // set()
        names.set(0, "Jack");
        System.out.println("set: " + names);

        // remove()
        names.remove(0);
        System.out.println("remove: " + names);

        // size()
        int size = names.size();
        System.out.println("size: " + size);

        // clear()
        // names.clear();
        // System.out.println("clear: " + names);

        // addAll()
        List<String> moreNames = new ArrayList<String>();
        moreNames.add("Henry");
        moreNames.add("Martin");
        moreNames.add("Shawn");

        names.addAll(moreNames);

        System.out.println("moreNames: " + moreNames);
        System.out.println("names: " + names);

        // contains()
        boolean contains = names.contains("Leo");
        System.out.println("contains: " + contains);

        // isEmpty()
        // names.clear();
        boolean isEmpty = names.isEmpty();
        System.out.println("isEmpty: " + isEmpty);

        // indexOf()
        int index = names.indexOf("Justin");
        System.out.println("index: " + names.get(index));

        // Collections.sort()
        Collections.sort(names);
        Collections.sort(numbers);
        System.out.println("sort: " + names);
        System.out.println("sort: " + numbers);

        System.out.println("===== ITERATION =====");
        // Iteration methods: forEach, filter, map, reduce

        for (int i = 0; i < names.size(); i++) {
            System.out.println("value: " + names.get(i));
        }

        for (String value : names) {
            System.out.println("value: " + value);
        }

        System.out.println("===== forEach =====");
        names.forEach(value -> System.out.println("value: " + value));

        System.out.println("===== filter =====");
        List<String> filteredNames = names.stream().filter(value -> {
            return value.startsWith("B");
        }).collect(Collectors.toList());
        System.out.println("filteredNames: " + filteredNames);

        System.out.println("===== map =====");
        List<String> uppesCaseNames = names.stream().map(value -> {
            return value.toUpperCase();
        }).collect(Collectors.toList());
        System.out.println("uppesCaseNames: " + uppesCaseNames);

        System.out.println("===== reduce =====");
        int totalSum = numbers.stream().reduce(10, (a, b) -> a + b);
        System.out.println("totalSum: " + totalSum);
    }

}

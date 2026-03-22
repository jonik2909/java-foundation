import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
         * ARRAYS: Object
         * state: length
         * methods:
         * toString(), sort(), binarySearch(),
         * copyOf(), copyOfRange(), equals()
         * Iteration methods: forEach, filter, map, reduce
         */

        // index > value
        // 0. 1. 2. 3. 4 5
        int[] scores = { 85, 90, 78, 92, 88 };
        char[] letters = { 'D', 'A', 'C', 'B' };

        System.out.println("scores: " + Arrays.toString(scores));
        System.out.println("length: " + scores.length);

        // System.out.println("before: " + scores[3]);
        // scores[5] = 72;
        // System.out.println("after: " + scores[3]);

        // sort() > mutable
        Arrays.sort(scores);
        System.out.println("sort: " + Arrays.toString(scores));

        Arrays.sort(letters);
        System.out.println("letters: " + Arrays.toString(letters));

        // binarySearch()
        int index = Arrays.binarySearch(scores, 92);
        System.out.println("binarySearch: " + index);

        // copyOf() & copyOfRange()
        int[] newScores = Arrays.copyOf(scores, scores.length);
        System.out.println("newScores: " + Arrays.toString(newScores));

        int[] midScores = Arrays.copyOfRange(scores, 1, 4);
        System.out.println("midScores: " + Arrays.toString(midScores));

        // equals()
        boolean isSame = Arrays.equals(scores, newScores);
        System.out.println("isSame: " + isSame);

        System.out.println("===== ITERATION =====");
        // Iteration methods: forEach, filter, map, reduce

        System.out.println("===== for =====");

        // for (int i = 0; i < scores.length; i++) {
        // System.out.println(scores[i]);
        // }

        for (int value : scores) {
            System.out.println(value);
        }

        System.out.println("===== forEach =====");
        Arrays.stream(scores).forEach(score -> System.out.println("score: " + score));

        System.out.println("===== filter =====");
        int[] topScores = Arrays.stream(scores).filter(value -> {
            System.out.println("value: " + value);
            return value >= 90; // true
        }).toArray();
        System.out.println("topScores: " + Arrays.toString(topScores));

        System.out.println("===== map =====");
        int[] bonusScores = Arrays.stream(scores).map(value -> value + 5).toArray();
        System.out.println("bonusScores: " + Arrays.toString(bonusScores));

        System.out.println("===== reduce =====");
        int[] nums = { 1, 2, 3 };
        int totalSum = Arrays.stream(nums).reduce(10, (a, b) -> a + b);
        System.out.println("totalSum: " + totalSum);

    }
}

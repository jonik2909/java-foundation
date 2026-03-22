import java.util.Arrays;

public class PrimitiveReference {
    public static void main(String[] args) {
        System.out.println("===== Primitive Types =====");
        int a = 10;
        int b = a;

        a = 20;

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("===== Reference Types =====");
        int[] arr1 = { 10, 20, 30 };
        int[] arr2 = arr1;
        int[] arr3 = arr1.clone();

        arr1[0] = 99;

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));

        System.err.println("arr1: " + System.identityHashCode(arr1)); // 1933863327
        System.err.println("arr2: " + System.identityHashCode(arr2)); // 1933863327
        System.err.println("arr3: " + System.identityHashCode(arr3)); // 112810359
    }
}

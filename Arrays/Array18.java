import java.util.Arrays;

public class Array18 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] copy = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied array: " + Arrays.toString(copy));
    }
}
import java.util.Arrays;

public class array4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5};
        int remove = 3;

        int[] result = new int[arr.length];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != remove) {
                result[idx++] = arr[i];
            }
        }


        int[] finalArr = Arrays.copyOf(result, idx);

        System.out.println("Array after removing " + remove + ": " + Arrays.toString(finalArr));
    }
}
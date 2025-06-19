import java.util.Arrays;

public class Array15 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 4, 2, 8};
        int k = 3;

        Arrays.sort(arr);  // Ascending sort

        System.out.print("K smallest elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
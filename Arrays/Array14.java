import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 4, 2, 8};
        int k = 3;

        Arrays.sort(arr);  // Ascending sort

        System.out.print("K largest elements: ");
        for (int i = arr.length - k; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

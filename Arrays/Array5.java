public class Array5 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 3, 9};
        int min = arr[0], max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.printf("Min: %d, Max: %d%n", min, max);
    }
}
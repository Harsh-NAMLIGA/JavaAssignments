public class Array20 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
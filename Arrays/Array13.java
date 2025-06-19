public class Array13 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 7, 6};

        System.out.print("Even numbers: ");
        for (int num : arr) {
            if (num % 2 == 0) System.out.print(num + " ");
        }

        System.out.print("\nOdd numbers: ");
        for (int num : arr) {
            if (num % 2 != 0) System.out.print(num + " ");
        }
    }
}
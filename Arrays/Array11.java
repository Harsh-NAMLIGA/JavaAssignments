public class Array11 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 15};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num != largest) {
                second = num;
            }
        }

        System.out.println("Second largest: " + second);
    }
}
public class Array8 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "cherry", "banana"};

        System.out.println("Duplicate strings:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}

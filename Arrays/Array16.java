import java.util.Arrays;

public class Array16 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = {3, 4};

        int[] temp = a;
        a = b;
        b = temp;

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
    }
}
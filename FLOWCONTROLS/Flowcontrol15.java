public class Flowcontrol15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 999; i++) {
            int num = i, sum = 0, original = i;
            while (num > 0) {
                int d = num % 10;
                sum += d * d * d;
                num /= 10;
            }
            if (sum == original) System.out.print(original + " ");
        }
    }
}

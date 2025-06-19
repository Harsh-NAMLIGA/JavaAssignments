public class Flowcontrol18 {
    public static void main(String[] args) {
        int num = 145, sum = 0, original = num;

        for (; num > 0; num /= 10) {
            int fact = 1, digit = num % 10;
            for (int i = 1; i <= digit; i++) fact *= i;
            sum += fact;
        }

        System.out.println(original + " is Strong? " + (sum == original));
    }
}

public class Flowcontrol14 {
    public static void main(String[] args) {
        int num = 153, original = num, sum = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            sum += digit * digit * digit;
        }
        System.out.println(original + " is Armstrong? " + (sum == original));
    }
}

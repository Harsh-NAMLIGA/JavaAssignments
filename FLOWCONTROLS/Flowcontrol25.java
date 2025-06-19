public class Flowcontrol25 {
    public static void main(String[] args) {
        int num = 121, rev = 0, original = num;

        for (; num != 0; num /= 10) {
            rev = rev * 10 + num % 10;
        }

        System.out.println(original + " is Palindrome? " + (rev == original));
    }
}

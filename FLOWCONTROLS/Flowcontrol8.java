public class Flowcontrol8 {
    public static void main(String[] args) {
        int num = 1234, sum = 0;
        for (; num != 0; num /= 10) {
            sum += num % 10;
        }
        System.out.println("Sum: " + sum);
    }
}

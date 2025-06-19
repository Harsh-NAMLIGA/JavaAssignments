public class Flowcontrol12 {
    public static void main(String[] args) {
        int n = 50, sum = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false; break;
                }
            }
            if (isPrime) sum += i;
        }
        System.out.println("Sum of primes: " + sum);
    }
}

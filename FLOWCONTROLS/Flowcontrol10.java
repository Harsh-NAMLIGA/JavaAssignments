public class Flowcontrol10 {
    public static void main(String[] args) {
        int num = 13;
        boolean isPrime = true;

        if (num < 2) isPrime = false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(num + " is prime? " + isPrime);
    }
}

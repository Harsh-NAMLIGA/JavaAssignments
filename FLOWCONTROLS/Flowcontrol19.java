public class Flowcontrol19 {
    public static void main(String[] args) {
        for (int num = 1; num <= 1000; num++) {
            int temp = num, sum = 0;
            while (temp > 0) {
                int digit = temp % 10, fact = 1;
                for (int i = 1; i <= digit; i++) fact *= i;
                sum += fact;
                temp /= 10;
            }
            if (sum == num) System.out.println(num + " is Strong");
        }
    }
}

public class Flowcontrol20 {
    public static void main(String[] args) {
        int num = 12345;
        int digits = (int) Math.log10(num);  // count digits - 1
        int first = num / (int)Math.pow(10, digits);
        int last = num % 10;

        int middle = (num % (int)Math.pow(10, digits)) / 10;

        int result = last * (int)Math.pow(10, digits) + middle * 10 + first;

        System.out.println("Swapped: " + result);
    }
}

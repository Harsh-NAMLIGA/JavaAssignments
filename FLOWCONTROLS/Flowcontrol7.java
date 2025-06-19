public class Flowcontrol7 {
    public static void main(String[] args) {
        int num = 12345, count = 0;
        for (; num != 0; num /= 10) {
            count++;
        }
        System.out.println("Digits: " + count);
    }
}

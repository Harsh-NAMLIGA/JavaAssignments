public class Alphabetpattern15 {

    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (char ch = (char)('A' + i - 1); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

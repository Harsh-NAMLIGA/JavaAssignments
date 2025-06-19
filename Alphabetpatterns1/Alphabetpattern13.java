public class Alphabetpattern13 {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.print("A ");
            char ch = (char)('A' + i);
            for (int j = 1; j < i; j++) {
                System.out.print((char)(ch + j - 1) + " ");
            }
            if (i > 0)
                System.out.print("A");
            System.out.println();
        }
    }
}

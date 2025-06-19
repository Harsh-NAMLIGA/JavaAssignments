public class Alphabet23 {
    public static void main(String[] args) {
        int rows = 4;
        char ch = 'J';

        for (int i = 1; i <= rows; i++) {

            char[] line = new char[i];
            for (int j = i - 1; j >= 0; j--) {
                line[j] = ch;
                ch--;
            }


            for (int j = 0; j < i; j++) {
                System.out.print(line[j]);
            }
            System.out.println();
        }
    }
}

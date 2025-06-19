public class Alphabetpattern12 {

    public static void main(String[] args) {
        for (char row = 'A'; row <= 'F'; row++) {
            char ch = row;
            for (int j = 0; j <= row - 'A'; j++) {
                System.out.print(ch + " ");
                ch += 5;
            }
            System.out.println();
        }
    }
}

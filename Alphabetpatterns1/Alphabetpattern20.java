public class Alphabetpattern20 {

        public static void main(String[] args) {
            int n = 6;

            for (int i = 1; i <= n; i++) {

                for (char ch = 'A'; ch < 'A' + i; ch++) {
                    System.out.print(ch);
                }

                for (char ch = (char)('A' + i - 2); ch >= 'A'; ch--) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }




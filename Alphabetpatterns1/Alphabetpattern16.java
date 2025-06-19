public class Alphabetpattern16 {


        public static void main(String[] args) {
            int max = 6;


            for (int i = 1; i <= max; i++) {
                for (char ch = 'A'; ch < 'A' + i; ch++) {
                    System.out.print(ch);
                }
                System.out.println();
            }

            for (int i = max - 1; i >= 1; i--) {
                for (char ch = 'A'; ch < 'A' + i; ch++) {
                    System.out.print(ch);
                }
                System.out.println();
            }
        }
    }


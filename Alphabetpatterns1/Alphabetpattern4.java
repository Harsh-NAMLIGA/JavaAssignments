public class Alphabetpattern4 {


        public static void main(String[] args) {
            for (int i = 6; i >= 0; i--) {
                for (char ch = 'A'; ch <= 'A' + i; ch++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
            }
        }
    }

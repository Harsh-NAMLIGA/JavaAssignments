public class Alphabetpattern21 {

        public static void main(String[] args) {
            int n = 6;
            for (int i = 1; i <= n; i++) {
                char ch = 'A';
                for (int j = 1; j <= n; j++) {
                    if (j <= n - i + 1) {
                        // Print 'A' for the first (n - i + 1) columns
                        System.out.print('A' + " ");
                    } else {

                        char rightChar = (char) ('A' + i - 1);
                        System.out.print(rightChar + " ");
                    }
                }
                System.out.println();
            }
        }
    }



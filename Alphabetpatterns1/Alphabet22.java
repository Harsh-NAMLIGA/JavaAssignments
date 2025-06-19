public class Alphabet22 {

        public static void main(String[] args) {
            int n = 6;

            for (int i = 0; i < n; i++) {

                for (char ch = 'A'; ch < 'A' + n - i; ch++) {
                    System.out.print(ch);
                }

                // Spaces in the middle
                int spaces = i * 2;
                for (int s = 0; s < spaces; s++) {
                    System.out.print(" ");
                }


                for (char ch = (char) ('A' + n - i - 1); ch >= 'A'; ch--) {
                    System.out.print(ch);
                }

                System.out.println();
            }
        }
    }






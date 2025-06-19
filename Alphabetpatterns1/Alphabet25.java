public class Alphabet25 {

        public static void main(String[] args) {
            int n = 5;

            for (int i = 0; i < n; i++) {
                char ch = 'E';

                // Print first (i + 1) decreasing letters from E
                for (int j = 0; j <= i; j++) {
                    System.out.print(ch--);
                }


                ch++;
                for (int j = i + 1; j < n; j++) {
                    System.out.print(ch);
                }

                System.out.println();
            }
        }
}


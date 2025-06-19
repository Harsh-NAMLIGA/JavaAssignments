public class Alphabet24 {


        public static void main(String[] args) {
            int rows = 9;

            for (int i = 0; i < rows; i++) {
                char ch = (char) ('A' + i);  // Starting character for the row
                int step = i + 1;            // Step increases with each row

                for (int j = 0; j <= i && ch <= 'Z'; j++) {
                    System.out.print(ch);
                    ch += step;  // Jump by 'step' positions
                }
                System.out.println();
            }
        }
    }


public class Alphabetpattern19 {



        public static void main(String[] args) {
            String str = "ABCDEF";
            int length = str.length();


            for (int i = 0; i < length; i++) {
                for (int j = i; j < length; j++) {
                    System.out.print(str.charAt(j) + " ");
                }
                System.out.println();
            }


            for (int i = length - 1; i >= 0; i--) {
                for (int j = i; j < length; j++) {
                    System.out.print(str.charAt(j) + " ");
                }
                System.out.println();
            }
        }
    }



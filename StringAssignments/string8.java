public class string8 {


        public static void main(String[] args) {
            String text = "abababa";
            String sub = "aba";
            int count = 0;
            int index = 0;
            while ((index = text.indexOf(sub, index)) != -1) {
                count++;
                index += sub.length();
            }
            System.out.println("Frequency of \"" + sub + "\": " + count);
        }
    }



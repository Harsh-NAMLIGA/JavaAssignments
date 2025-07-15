public class String12
{

        public static void main(String[] args) {
            String sentence = "This is Java";
            String[] tokens = sentence.split(" ");
            for (String t : tokens) {
                System.out.println("[" + t + "]");
            }
        }
    }



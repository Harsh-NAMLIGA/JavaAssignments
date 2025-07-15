public class string6
{

        public static void main(String[] args) {
            String sentence = "Hello Java World";
            String[] words = sentence.split(" ");
            String result = "";
            for (int i = words.length - 1; i >= 0; i--) {
                result += words[i] + " ";
            }
            System.out.println("Reversed words: " + result.trim());
        }
    }



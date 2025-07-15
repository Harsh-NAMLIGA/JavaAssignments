public class String15
{

        public static void main(String[] args) {
            String s = "ABC xyz!";
            int shift = 3;
            String result = "";
            for (char c : s.toCharArray()) {
                if (c >= 'A' && c <= 'Z') {
                    result += (char)('A' + (c - 'A' + shift) % 26);
                } else if (c >= 'a' && c <= 'z') {
                    result += (char)('a' + (c - 'a' + shift) % 26);
                } else {
                    result += c;
                }
            }
            System.out.println("Ciphered: " + result);
        }
    }



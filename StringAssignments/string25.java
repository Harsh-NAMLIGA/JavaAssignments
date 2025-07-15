public class string25
{

        public static void main(String[] args) {
            String s = "hello";
            char target = 'l';
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == target) {
                    count++;
                }
            }
            System.out.println("Occurrences of '" + target + "': " + count);
        }
    }



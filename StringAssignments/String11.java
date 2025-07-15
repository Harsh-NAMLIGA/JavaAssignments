public class String11
{

        public static void main(String[] args) {
            String s = "-12345";
            int num = 0;
            int sign = 1;
            int i = 0;
            if (s.charAt(0) == '-') {
                sign = -1;
                i = 1;
            }
            for (; i < s.length(); i++) {
                num = num * 10 + (s.charAt(i) - '0');
            }
            System.out.println("Converted number: " + (num * sign));
        }
    }



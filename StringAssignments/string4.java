public class string4 {


        public static void main(String[] args) {
            String s = "Hello World!";
            int vowels = 0, consonants = 0;
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    if ("aeiou".indexOf(c) != -1) vowels++;
                    else consonants++;
                }
            }
            System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
        }
    }



public class String14
{

        public static void main(String[] args) {
            String fullName = "John A Doe";
            String[] parts = fullName.split(" ");
            String last = parts[parts.length - 1];
            String firstMiddle = "";
            for (int i = 0; i < parts.length - 1; i++) {
                firstMiddle += parts[i] + " ";
            }
            firstMiddle = firstMiddle.trim();
            System.out.println(last + ", " + firstMiddle);
        }
    }



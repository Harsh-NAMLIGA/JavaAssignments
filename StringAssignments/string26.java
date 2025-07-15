public class string26
{

        public static void main(String[] args) {
            String template = "Hi, %s! You have %d new messages.";
            String msg = String.format(template, "User", 5);
            System.out.println(msg);
        }
    }



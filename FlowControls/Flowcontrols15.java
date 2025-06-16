import java.util.Scanner;
 class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter letter");
        char ch = sc.next().charAt(0);
        if (Character.isUpperCase(ch))
            System.out.println("Uppercase");
        else if (Character.isLowerCase(ch))
            System.out.println("Lowercase");
        else
            System.out.println("Not a letter");
    }
}
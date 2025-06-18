package FlowConrolls.FlowControls;

import java.util.Scanner;
 class CheckDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ch");
        char ch = sc.next().charAt(0);
        if (ch >= '0' && ch <= '9')
            System.out.println(ch + " is a digit");
        else
            System.out.println(ch + " is not a digit");
    }
}
package FlowConrolls.FlowControls;

import java.util.Scanner;
 class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter c");
         int c = sc.nextInt();
        if (a >= b && a >= c)
            System.out.println(a + " is greatest");
        else if (b >= a && b >= c)
            System.out.println(b + " is greatest");
        else
            System.out.println(c + " is greatest");
    }
}
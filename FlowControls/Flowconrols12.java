import java.util.Scanner;
 class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter c");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("Fahrenheit: " + f);
    }
}
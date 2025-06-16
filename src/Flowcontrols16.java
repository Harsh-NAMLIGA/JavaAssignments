import java.util.Scanner;
 class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        int month = sc.nextInt();
        if (month == 2)
            System.out.println("28 or 29 days");
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println("30 days");
        else if (month >= 1 && month <= 12)
            System.out.println("31 days");
        else
            System.out.println("Invalid month");
    }
}
import java.util.Scanner;
 class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M,P,C,E,H marks");
        int m = sc.nextInt();
        int p = sc.nextInt();
        int c = sc.nextInt();
        int e = sc.nextInt();
        int h = sc.nextInt();
        int total = m + p + c + e + h;
        System.out.println("Total marks are :" + total);
        double percent = total / 5.0;

        System.out.println("Percentage: " + percent);
        if (percent >= 90)
            System.out.println("Grade A");
        else if (percent >= 80)
            System.out.println("Grade B");
        else if (percent >= 70)
            System.out.println("Grade C");
        else if (percent >= 60)
            System.out.println("Grade D");
        else if (percent >= 40)
            System.out.println("Grade E");
        else
            System.out.println("Grade F");
    }
}
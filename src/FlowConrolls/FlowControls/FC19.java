package FlowConrolls.FlowControls;

import java.util.Scanner;
 class StudentDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        int marks = sc.nextInt();
        if (marks >= 60)
            System.out.println("Division 1");
        else if (marks >= 45)
            System.out.println("Division 2");
        else if (marks >= 30)
            System.out.println("Division 3");
        else
            System.out.println("Fail");
    }
}

package com.sms.details;

import java.util.Scanner;

import com.sms.dao.StudentDAO;
import com.sms.dao.impl.StudentDAOImpl;
import com.sms.model.Student;

public class StudentDetails {
    StudentDAO dao = new StudentDAOImpl();
    Scanner sc = new Scanner(System.in);

    public void adminMenu() {
        while (true) {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Students");
            System.out.println("2. View All Students");
            System.out.println("3. View Student by Number");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit Admin Menu");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    dao.addStudents();
                    break;
                case 2:
                    Student[] students = dao.viewAllStudents();
                    if (students != null) {
                        for (Student s : students) {
                            if (s != null)
                                System.out.println(s.getSno() + " | " + s.getSname() + " | " + s.getSadd());
                        }
                    } else {
                        System.out.println("No student records found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter student number: ");
                    int sno = sc.nextInt();
                    Student s = dao.viewStudent(sno);
                    if (s != null) {
                        System.out.println(s.getSno() + " | " + s.getSname() + " | " + s.getSadd());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter student number to update: ");
                    dao.updateStudent(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter student number to delete: ");
                    dao.deleteStudent(sc.nextInt());
                    break;
                case 6:
                    System.out.println("Exiting Admin Menu...");
                    return;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }

    public void studentMenu() {
        System.out.println("Student Menu (Coming Soon)!");
    }
}

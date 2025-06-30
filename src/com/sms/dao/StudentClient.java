package com.sms.dao;

import java.util.Scanner;

import com.sms.details.StudentDetails;

public class StudentClient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentDetails details = new StudentDetails();

        while (true) {
            System.out.println("=======================================");
            System.out.println("               1) Admin                ");
            System.out.println("               2) Student              ");
            System.out.println("               3) Exit                 ");
            System.out.println("=======================================");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter username: ");
                    String uname = sc.next();
                    System.out.print("Enter password: ");
                    String pass = sc.next();

                    if (uname.equals("Admin") && pass.equals("Admin@123")) {
                        details.adminMenu();
                    } else {
                        System.out.println("Invalid Credentials");
                    }
                    break;

                case 2:
                    System.out.print("Enter username: ");
                    String suname = sc.next();
                    System.out.print("Enter password: ");
                    String spass = sc.next();

                    if (suname.equals("shiva") && spass.equals("shiva@123")) {
                        details.studentMenu();
                    } else {
                        System.out.println("Invalid Credentials");
                    }
                    break;

                case 3:
                    System.out.println("Thanks for using the app!");
                    System.exit(0);

                default:
                    System.out.println("Please choose between 1 to 3.");
            }
        }
    }
}

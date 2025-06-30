package com.pms.UserClient;

import com.pms.dao.impl.UserDAOImpl;
import com.pms.details.UserDetails;
import java.util.Scanner;

public class UserClient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDAOImpl userDAO = new UserDAOImpl();
        UserDetails userDetails = new UserDetails();

        System.out.println("Welcome to Product Management System");

        // Register both user and admin credentials
        userDAO.addUserRegister();
        userDAO.addAdminRegister();

        while (true) {
            System.out.println("\nLogin");
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (userDAO.verifyUnameAndPwd(email, password)) {
                System.out.println("Login successful!");

                if (email.equalsIgnoreCase("admin@example.com")) {
                    userDetails.adminMenu();
                } else {
                    userDetails.userMenu();
                }
                break;
            } else {
                System.out.println("Invalid credentials, try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the system!");
    }
}
package com.ms.client;

import com.ms.dao.UserDAO;
import com.ms.dao.impl.UserDaoImpl;
import java.util.Scanner;

public class UserClient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserDAO userDAO = new UserDaoImpl();

        // Register user (hardcoded)
        userDAO.register();

        // Login
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean isLoginSuccess = userDAO.verifyUserNameAndPassword(username, password);

        if (isLoginSuccess) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid username or password.");
        }

        // Password recovery
        System.out.print("Enter username to recover password: ");
        String forgotUser = scanner.nextLine();

        String recoveredPassword = userDAO.forgotPassword(forgotUser);
        System.out.println("Password recovery result: " + recoveredPassword);

        scanner.close();
    }
}

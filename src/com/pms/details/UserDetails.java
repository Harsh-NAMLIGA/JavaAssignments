package com.pms.details;

import java.util.Scanner;
import com.pms.dao.impl.ProductDAOImpl;
import com.pms.model.Product;

public class UserDetails {
    Scanner scanner = new Scanner(System.in);
    ProductDAOImpl productDAO = new ProductDAOImpl();  // Declare here once

    public void adminMenu() {
        while (true) {
            System.out.println("\nAdmin Menu:");
            System.out.println("1) Add Products");
            System.out.println("2) View All Products");
            System.out.println("3) View Product");
            System.out.println("4) Update Products");
            System.out.println("5) Delete Product");
            System.out.println("6) Back");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Adding product...");
                    productDAO.addProducts();
                    break;
                case 2:
                    Product[] products = productDAO.viewAllProducts();
                    if (products.length == 0) {
                        System.out.println("No products found.");
                    } else {
                        for (Product p : products) {
                            System.out.println(p.getPid() + " | " + p.getPname() + " | Qty: " + p.getQty() + " | Price: " + p.getPrice());
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to view: ");
                    int pidView = Integer.parseInt(scanner.nextLine());
                    Product prodView = productDAO.viewProduct(pidView);
                    if (prodView != null) {
                        System.out.println(prodView.getPid() + " | " + prodView.getPname() + " | Qty: " + prodView.getQty() + " | Price: " + prodView.getPrice());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter Product ID to update quantity: ");
                    int pidUpdate = Integer.parseInt(scanner.nextLine());
                    int resUpdate = productDAO.updateProduct(pidUpdate);
                    if (resUpdate == 1) {
                        System.out.println("Product updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter Product ID to delete: ");
                    int pidDelete = Integer.parseInt(scanner.nextLine());
                    int resDelete = productDAO.deleteProduct(pidDelete);
                    if (resDelete == 1) {
                        System.out.println("Product deleted successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting Admin Menu...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    public void userMenu() {
        while (true) {
            System.out.println("\nUser Menu:");
            System.out.println("1) View All Products");
            System.out.println("2) View Product");
            System.out.println("3) Update Products");
            System.out.println("4) Back");

            System.out.print("Enter choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    Product[] products = productDAO.viewAllProducts();
                    if (products.length == 0) {
                        System.out.println("No products found.");
                    } else {
                        for (Product p : products) {
                            System.out.println(p.getPid() + " | " + p.getPname() + " | Qty: " + p.getQty() + " | Price: " + p.getPrice());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter Product ID to view: ");
                    int pidView = Integer.parseInt(scanner.nextLine());
                    Product prodView = productDAO.viewProduct(pidView);
                    if (prodView != null) {
                        System.out.println(prodView.getPid() + " | " + prodView.getPname() + " | Qty: " + prodView.getQty() + " | Price: " + prodView.getPrice());
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter Product ID to update quantity: ");
                    int pidUpdate = Integer.parseInt(scanner.nextLine());
                    int resUpdate = productDAO.updateProduct(pidUpdate);
                    if (resUpdate == 1) {
                        System.out.println("Product updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting User Menu...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}

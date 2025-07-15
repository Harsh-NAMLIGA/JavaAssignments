package com.pms.dao.impl;
import com.pms.dao.ProductDAO;
import com.pms.model.Product;
import java.util.Scanner;

public class ProductDAOImpl implements ProductDAO{
    private Product[] products = new Product[100]; // max 100 products
    private int count = 0; // number of products added

    @Override
    public void addProducts() {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        p.setPid(count + 1);
        System.out.print("Enter product name: ");
        p.setPname(sc.nextLine());
        System.out.print("Enter quantity: ");
        p.setQty(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter price: ");
        p.setPrice(Double.parseDouble(sc.nextLine()));

        products[count++] = p;
        System.out.println("Product added: " + p.getPname());
    }

    @Override
    public Product[] viewAllProducts() {
        Product[] currentProducts = new Product[count];  // count = number of products added
        for (int i = 0; i < count; i++) {
            currentProducts[i] = products[i];
        }
        return currentProducts;
    }

    @Override
    public Product viewProduct(int pid) {
        for (int i = 0; i < count; i++) {
            if (products[i].getPid() == pid) {
                return products[i];
            }
        }
        return null; // product not found
    }

    @Override
    public int updateProduct(int pid) {
        for (int i = 0; i < count; i++) {
            if (products[i].getPid() == pid) {
                // For example, increase quantity by 5
                products[i].setQty(products[i].getQty() + 5);
                System.out.println("Product quantity updated for pid: " + pid);
                return 1; // success
            }
        }
        return 0; // product not found
    }

    @Override
    public int deleteProduct(int pid) {
        for (int i = 0; i < count; i++) {
            if (products[i].getPid() == pid) {
                // Shift products left to remove deleted product
                for (int j = i; j < count - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[count - 1] = null;
                count--;
                System.out.println("Product deleted with pid: " + pid);
                return 1; // success
            }
        }
        return 0; // product not found
    }
}

package com.pms.dao.impl;

import com.pms.dao.UserDAO;
import java.util.HashMap;
import java.util.Map;

public class UserDAOImpl implements UserDAO {

    // Store user email and password pairs
    private Map<String, String> users = new HashMap<>();

    @Override
    public void addUserRegister() {
        users.put("user@example.com", "password123");
        System.out.println("User registered with email: user@example.com");
    }

    @Override
    public void addAdminRegister() {
        users.put("admin@example.com", "admin123");
        System.out.println("Admin registered with email: admin@example.com");
    }

    @Override
    public boolean verifyUnameAndPwd(String email, String pass) {
        return users.containsKey(email) && users.get(email).equals(pass);
    }

    @Override
    public String forgotPassword(String email) {
        return users.getOrDefault(email, "User not found");
    }
}

package com.ms.dao.impl;
import com.ums.model.User;
import com.ms.dao.UserDAO;

public class UserDaoImpl implements UserDAO {

    String storedUsername;
    String storedPassword;

    @Override
    public void register() {
        storedUsername = "user1";
        storedPassword = "pass1";
        System.out.println("User registered: " + storedUsername);
    }

    @Override
    public boolean verifyUserNameAndPassword(String uname, String pass) {
        if (storedUsername == null) return false;
        if (!storedUsername.equals(uname)) return false;
        if (storedPassword == null) return false;
        if (!storedPassword.equals(pass)) return false;
        return true;
    }

    @Override
    public String forgotPassword(String uname) {
        if (storedUsername != null && storedUsername.equals(uname)) {
            return storedPassword;
        }
        return "User not found";
    }
}






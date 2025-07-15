package com.pms.dao;
import com.pms.dao.UserDAO;
public interface UserDAO {
    void addUserRegister();
    void addAdminRegister();
    boolean verifyUnameAndPwd(String email, String pass);
    String forgotPassword(String email);
}


package com.ms.dao;
import com.ums.model.User;

public interface UserDAO {

    public void register();
    public boolean verifyUserNameAndPassword(String uname, String pass);
    String forgotPassword(String uname);
}

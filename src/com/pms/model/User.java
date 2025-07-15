package com.pms.model;

public class User {

    int uid;
    String FirstName;
    String LastName;
    String Email;
    double PhNo;
    String Uname;
    String Pwd;

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setFirstName(String firstName) {

        this.FirstName = firstName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public void setPhNo(double phNo) {
        this.PhNo = phNo;
    }

    public void setUname(String uname) {
        this.Uname = uname;
    }

    public void setPwd(String pwd) {
        this.Pwd = pwd;
    }

    public int getUid() {

        return uid;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmail() {
        return Email;
    }

    public double getPhNo() {
        return PhNo;
    }

    public String getUname() {
        return Uname;
    }

    public String getPwd() {
        return Pwd;
    }
}

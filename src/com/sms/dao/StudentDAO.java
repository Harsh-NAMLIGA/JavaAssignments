package com.sms.dao;
import com.sms.model.Student;

public interface StudentDAO {
    void addStudents();
    Student[] viewAllStudents();
    Student viewStudent(int sno);
    void updateStudent(int sno);
    void deleteStudent(int sno);

}

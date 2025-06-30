package com.sms.dao.impl;

import java.util.Scanner;

import com.sms.dao.StudentDAO;
import com.sms.model.Student;

public class StudentDAOImpl implements StudentDAO {

    Scanner sc = new Scanner(System.in);
    public static Student[] addStudent = null;

    @Override
    public void addStudents() {
        System.out.println("Enter the number of students:");
        int size = sc.nextInt();
        addStudent = new Student[size];
        for (int i = 0; i < size; ++i) {
            System.out.println("Enter Student Number:");
            int sno = sc.nextInt();
            System.out.println("Enter Student Name:");
            String sname = sc.next();
            System.out.println("Enter Student Address:");
            String sadd = sc.next();
            Student stu = new Student();
            stu.setSno(sno);
            stu.setSname(sname);
            stu.setSadd(sadd);
            addStudent[i] = stu;
            System.out.println("Student added successfully!\n");
        }
    }

    @Override
    public Student[] viewAllStudents() {
        return addStudent;
    }

    @Override
    public Student viewStudent(int sno) {
        if (addStudent != null) {
            for (Student stu : addStudent) {
                if (stu != null && stu.getSno() == sno)
                    return stu;
            }
        }
        return null;
    }

    @Override
    public void updateStudent(int sno) {
        boolean found = false;
        if (addStudent != null) {
            for (Student stu : addStudent) {
                if (stu != null && stu.getSno() == sno) {
                    found = true;
                    System.out.println("1) Update Name  2) Update Address");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("Enter new name:");
                        stu.setSname(sc.next());
                        System.out.println("Name updated!");
                    } else if (choice == 2) {
                        System.out.println("Enter new address:");
                        stu.setSadd(sc.next());
                        System.out.println("Address updated!");
                    }
                }
            }
        }
        if (!found)
            System.out.println("Student not found.");
    }

    @Override
    public void deleteStudent(int sno) {
        boolean deleted = false;
        if (addStudent != null) {
            for (int i = 0; i < addStudent.length; i++) {
                if (addStudent[i] != null && addStudent[i].getSno() == sno) {
                    addStudent[i] = null;
                    deleted = true;
                    System.out.println("Student deleted!");
                    break;
                }
            }
        }
        if (!deleted)
            System.out.println("Student not found.");
    }
}

package com.assignment.Task6;

import java.util.*;

public class Student{

    String name;
    int EnrollmentNo;

    Student(String name, int EnrollmentNo) {
        this.name = name;
        this.EnrollmentNo = EnrollmentNo;
    }
    public static void main(String args[])throws Exception {
        Student student = new Student("Amay",132);

        System.out.println("The name of the Student "+student.name+" their Enrollment No is "+student.EnrollmentNo);
    }
}

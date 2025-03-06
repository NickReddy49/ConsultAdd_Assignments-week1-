package com.assignment.Task6;

public class Student_q4 {
    String name;

    Student_q4() {
        this.name = "Unknown";
    }

    Student_q4(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }

    public static void main(String args[])throws Exception {
        Student_q4 student1 = new Student_q4();
        Student_q4 student2 = new Student_q4("Alice");
        Student_q4 student3 = new Student_q4();
        Student_q4 student4 = new Student_q4("Bob");

        // Displaying student names
        student1.display();
        student2.display();
        student3.display();
        student4.display();
    }
}

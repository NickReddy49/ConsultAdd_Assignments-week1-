package com.assignment.Task6;

import java.util.*;

public class Employee {
    String name;
    int yearOfJoining;
    double salary;
    String address;

    Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    void display() {
        System.out.printf("%-10s %-15d %-10.2f %-20s\n", name, yearOfJoining, salary, address);
    }

    public static void main(String args[])throws Exception {
        Employee emp1 = new Employee("Robert", 1994, 50000, "64C- WallsStreet");
        Employee emp2 = new Employee("Sam", 2000, 60000, "68D- WallsStreet");
        Employee emp3 = new Employee("John", 1999, 55000, "26B- WallsStreet");

        System.out.printf("%-10s %-15s %-10s %-20s\n", "Name", "Year of Joining", "Salary", "Address");
        System.out.println("-----------------------------------------------------------");

        emp1.display();
        emp2.display();
        emp3.display();
    }
}

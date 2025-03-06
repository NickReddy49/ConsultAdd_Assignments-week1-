package com.assignment.Task6;

import java.util.*;

public class Triangle{
    int a, b, c;

    //Constructor without parameters, initializing sides to 3, 4, 5
    Triangle() {
        this.a = 3;
        this.b = 4;
        this.c = 5;
    }

    // Method to calculate the perimeter
    int getPerimeter() {
        return a + b + c;
    }


    double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String args[])throws Exception {
        Triangle t = new Triangle();
        System.out.println("Perimeter: " + t.getPerimeter());
        System.out.println("Area: " + t.getArea());
    }

}


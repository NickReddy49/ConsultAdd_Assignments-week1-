package com.assignment.Task6;

import java.util.*;

public class Rectangle {
    int length, breadth;

    Rectangle() {
        this.length = 0;
        this.breadth = 0;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    Rectangle(int side) {
        this.length = side;
        this.breadth = side;
    }

    int calculateArea() {
        return length * breadth;
    }

    void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Area: " + calculateArea());
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5, 10);
        Rectangle rect3 = new Rectangle(7);

        rect1.display();
        rect2.display();
        rect3.display();
    }
}

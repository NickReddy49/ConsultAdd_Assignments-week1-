package com.assignment.Task1;

import java.util.*;

public class Question5_task1 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle");
        float radius = sc.nextFloat();
        double area = Math.PI * Math.pow(radius,2);
        System.out.println("The Area of the Circle is "+area);
    }
}

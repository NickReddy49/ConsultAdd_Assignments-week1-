package com.assignment.Task3;

import java.util.*;
public class Question5_Task3 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n to sum even numbers");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        int sum = 0;

        while (count < n) {
            sum += num;
            num += 2;
            count++;
        }

        System.out.println("Sum of first " + n + " even numbers is: " + sum);
    }
}
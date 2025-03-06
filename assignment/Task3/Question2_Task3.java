package com.assignment.Task3;

import java.util.*;
public class Question2_Task3 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate the factorial of");
        int N = sc.nextInt();
        int n = N;
        int prod = 1;
        while (n>0) {
            prod = prod * n;
            n = n-1;
        }
        System.out.println("The Factorial of a number "+N+" is "+prod);
    }
}

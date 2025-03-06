package com.assignment.Task3;

import java.util.*;
public class Question1_Task3 {
    public static void main(String args[])throws Exception {
        //Write a Program to display the Fibonacci Series ...
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N to display Fibonacci Series for these Numbers");
        int N = sc.nextInt();
        int prev = 0, curr = 1 , sum = 0;
        System.out.print("Fibonacci Series "+prev+","+curr);
        for (int i = 2; i < N; i++) {
            sum = prev + curr;
            prev = curr;
            curr = sum;
            System.out.print(","+sum);
        }
    }
}

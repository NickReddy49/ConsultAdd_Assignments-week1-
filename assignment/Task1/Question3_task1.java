package com.assignment.Task1;

import java.util.Scanner;

public class Question3_task1 {
    public static void main(String args[])throws Exception {
     //*
        //Swap two numbers using the third variable as the result name and do the same task without using any third variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        System.out.println("Before Swapping a:"+a+" b is "+b);
        // using a third variable to swap numbers
        int result = 0;
        result = a;
        a = b;
        b = result;
        System.out.println("The Swapped Variables a and b are a:"+a+" the swapped variable b is "+b);
        // approach with out using a swapping variable is using a bitwise XOR operator operation here
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("The Swapped Variables a and b without a third variable are a:"+a+" the swapped variable b is "+b);

    }
}

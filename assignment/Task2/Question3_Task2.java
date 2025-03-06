package com.assignment.Task2;

import java.util.*;
public class Question3_Task2 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to be divided");
        int num  = sc.nextInt();
        System.out.println("Enter the Number to divide with");
        int divide = sc.nextInt();

        int q = num/divide;
        int rem = num%divide;

        System.out.println("The Quotient for the number is "+q+" and the remainder is "+rem);
    }
}

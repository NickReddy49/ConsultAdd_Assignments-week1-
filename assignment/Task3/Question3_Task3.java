package com.assignment.Task3;

import java.util.*;
public class Question3_Task3 {
    public static void main(String args[]) throws Exception {
        //Enter a number n for input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number n to check for palindrome");
        int n = sc.nextInt();
        int originalNum = n;
        int reversedNum = 0;

        while (n > 0) {
            int digit = n % 10;
            reversedNum = reversedNum * 10 + digit;
            n /= 10;
        }
        if(originalNum == reversedNum) {
            System.out.println("The number "+originalNum+" is a Palindrome Number");
        } else {
            System.out.println("The number "+originalNum+" is not a Palindrome Number");
        }
    }
}

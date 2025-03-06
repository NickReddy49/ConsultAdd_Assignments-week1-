package com.assignment.Task7;

import java.util.*;
public class Question5_Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's an Armstrong number:");
        int num = sc.nextInt();

        int originalNum = num;

        int numDigits = 0;
        while (num != 0) {
            numDigits++;
            num /= 10;
        }

        num = originalNum;

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + (int)Math.pow(digit, numDigits);
            num /= 10;
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }
    }
}

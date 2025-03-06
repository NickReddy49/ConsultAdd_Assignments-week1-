package com.assignment.Task2;

import java.util.Scanner;

public class Question4_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int yr = scanner.nextInt();

        if (yr % 400 == 0) {
            System.out.println("The year,"+yr+ " is a leap year.");
        } else {
            System.out.println("The year,"+yr+ " is not a leap year.");
        }
    }
}


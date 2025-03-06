package com.assignment.Task2;

import java.util.Scanner;

public class Question5_Task2 {
    public static void main(String args[])throws Exception {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Percentage you have Received");
        Double percentage = sc.nextDouble();
        Character grade =' ';
        if(percentage > 90) {
            grade = 'A';
        } else if(percentage <= 90 && percentage > 75) {
            grade = 'B';
        } else {
            grade = 'C';
        }
        System.out.println("The Grade you have Received is "+grade);
    }
}

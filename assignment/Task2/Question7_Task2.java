package com.assignment.Task2;

import java.util.Scanner;

public class Question7_Task2 {
    public static void main(String args[])throws Exception {
        // Take as Input a number
        Scanner sc = new Scanner(System.in);
        int input = 0;
        System.out.println("Please Enter the numbers continuously");
        while(true) {
            input = sc.nextInt();
            if( input >= 0) {
                System.out.println("Good Going");
                continue;
            } else {
                System.out.println("It's Over");
                break;
            }
        }
    }
}

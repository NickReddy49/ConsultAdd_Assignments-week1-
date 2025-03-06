package com.assignment.Task3;

import java.util.*;

public class Question8_Task3 {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Enter a number or type 'stop' to terminate");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            } else {
                String input = sc.next();
                if (input.equalsIgnoreCase("stop")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter a number or 'stop' to finish.");
                }
            }
        }
        System.out.println("The Maximum number is "+max+" and the Minimum number is "+min);
    }
}


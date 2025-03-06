package com.assignment.Task2;

import java.util.Scanner;

public class Question8_Task2 {
    public static void main(String args[])throws Exception {
        System.out.println("Enter your income to calculate Tax");
        Scanner sc = new Scanner(System.in);
        double inc = sc.nextDouble();
        double calcTax = 0;
        if (inc <= 250000) {
            calcTax = 0;
        } else if (inc <= 600000) {
            calcTax = (inc - 250000) * 0.10;
        } else if (inc <= 1200000) {
            calcTax = (600000 - 250000) * 0.10 + (inc - 600000) * 0.18;
        } else {
            calcTax = (600000 - 250000) * 0.10 + (1200000 - 600000) * 0.18 + (inc - 1200000) * 0.25;
        }
        System.out.println("Income Tax calculated as below "+ calcTax);
    }
}


package com.assignment.Task3;

import java.util.*;

public class Question4_Task3 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int n = sc.nextInt();
        boolean prime = true;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
             System.out.println("The number "+n+" is not prime");
             prime = false;
            }
        }
        if(prime) {
            System.out.println("The number "+n+" is a prime");
        }
    }
}

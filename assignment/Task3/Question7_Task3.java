package com.assignment.Task3;

import java.util.*;

public class Question7_Task3 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number n");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            for(int j=0 ; j < n ; j++) {
                if(j < n-1-i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

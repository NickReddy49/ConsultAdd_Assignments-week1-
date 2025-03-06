package com.assignment.Task4;

import java.util.*;

public class Question1_Task4 {
    public static void main(String args[])throws Exception {
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the n elements one by one");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Elements of the Array are");
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(","+arr[i]);
        }
    }
}

package com.assignment.Task4;

import java.util.*;

public class Question3_Task4 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //Input: Number to search
        System.out.print("Enter the number to search: ");
        int target = sc.nextInt();

        //Linear Search
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                System.out.println("Number " + target + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Number " + target + " not found in the array.");
        }
    }
}

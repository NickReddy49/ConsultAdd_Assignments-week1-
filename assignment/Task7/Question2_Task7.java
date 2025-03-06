package com.assignment.Task7;

import java.util.*;

public class Question2_Task7 {
    public static void main(String args[])throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }


        Set<Integer> set1 = new HashSet<>();
            Set<Integer> intersection = new HashSet<>();

            for (int num : arr1) {
                set1.add(num);
            }

            for (int num : arr2) {
                if (set1.contains(num)) {
                    intersection.add(num);
                }
            }

            System.out.println("Intersection of arrays: " + intersection);
    }
}

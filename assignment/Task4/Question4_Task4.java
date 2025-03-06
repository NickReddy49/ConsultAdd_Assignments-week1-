package com.assignment.Task4;

import java.util.*;
public class Question4_Task4 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
    int size = sc.nextInt();

    int[] arr = new int[size];

        System.out.println("Enter " + size + " elements (sorted order preferred):");
        for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
    }

        Arrays.sort(arr);

        System.out.print("Enter the number to search: ");
    int target = sc.nextInt();

    int result = binarySearch(arr, target);

        if (result != -1) {
        System.out.println("Number " + target + " found at index " + result);
    } else {
        System.out.println("Number " + target + " not found in the array.");
    }
        sc.close();
}


public static int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] < target) {
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }
    }

    return -1;

}
}

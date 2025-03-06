package com.assignment.Task7;

import java.util.*;

public class Question11_Task7 {
    public static void findAllSubarrays(int[] arr, int targetSum) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int prefixSum = 0;

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum = prefixSum + arr[i];

            //If (prefixSum - targetSum) exists, it means subarray(s) found
            if (map.containsKey(prefixSum - targetSum)) {
                for (int startIndex : map.get(prefixSum - targetSum)) {
                    System.out.print("Subarray: ");
                    for (int j = startIndex + 1; j <= i; j++) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.println();
                }
            }
            //store occurrences of prefixSum
            map.putIfAbsent(prefixSum, new ArrayList<>());
            map.get(prefixSum).add(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int targetSum = sc.nextInt();

        //Find all subarrays
        findAllSubarrays(arr, targetSum);
    }
  }

package com.assignment.Task4;

import java.util.*;

public class Question7_Task4 {
    public static void main(String args[])throws Exception {
        //Write a program to remove the duplicates from the sorted Array!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array!");
        int n = sc.nextInt();
        int numbers [] = new int[n];

        System.out.println("Enter the numbers in the array in a sorted order or enter randomly");
        for(int i = 0; i < numbers.length;i++) {
            numbers[i] = sc.nextInt();
        }
        //
        Arrays.sort(numbers);
        HashSet<Integer> set = new LinkedHashSet<>();
        int count_zero = 0;

        for (int i = 0; i < numbers.length; i++) {
            if(!set.contains(numbers[i])) {
                set.add(numbers[i]);
            } else {
                count_zero = count_zero + 1;
            }
        }

        int index = 0;
        for(int val : set) {
            numbers[index] = val;
            index = index + 1;
        }

        while(index < numbers.length) {
            numbers[index]  = 0;
            index = index +1;
        }

        //Print the array
        System.out.print("["+numbers[0]);
        for(int i = 1; i < numbers.length; i++) {
            System.out.print(","+numbers[i]);
        }
        System.out.print("]");



    }
}

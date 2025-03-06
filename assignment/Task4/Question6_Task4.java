package com.assignment.Task4;

import java.util.*;

public class Question6_Task4 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array!");
        int n = sc.nextInt();
        System.out.println("Enter the target");
        int target = sc.nextInt();
        int numbers [] = new int[n];
        System.out.println("Enter the numbers in the array");
        for(int i = 0; i < numbers.length;i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        int firstpos = 0 , lastpos = numbers.length-1 ;
        int arr [] = new int[2];
        while (firstpos < lastpos) {
            if((numbers[lastpos] > target-numbers[firstpos]) && (target-numbers[lastpos] < numbers[firstpos] )) {
                lastpos = lastpos - 1;
            } else if((numbers[lastpos] < target-numbers[firstpos]) && (target-numbers[lastpos] > numbers[firstpos]))  {
                firstpos = firstpos + 1;
            } else if( (numbers[firstpos] + numbers[lastpos]) == target) {
                arr[0] = numbers[firstpos];
                arr[1] = numbers[lastpos];
                break;
            }
        }
        System.out.println("["+arr[0]+","+arr[1]+"]");
    }
}


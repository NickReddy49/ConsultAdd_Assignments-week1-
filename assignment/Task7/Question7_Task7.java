package com.assignment.Task7;

import java.util.Scanner;

public class Question7_Task7 {
    public static void printPermutations(char[] str, int index) {
        //Base case if the length has been reached
        if (index == str.length) {
            System.out.println(new String(str));
            return;
        }

        for (int i = index; i < str.length; i++) {
            swap(str, index, i);
            printPermutations(str, index + 1);
            swap(str, index, i);
        }
    }

    //function to swap characters in an Array
    private static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        System.out.println("All permutations of the string:");
        printPermutations(charArray, 0);
    }
}

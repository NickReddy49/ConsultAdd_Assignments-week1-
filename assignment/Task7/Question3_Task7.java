package com.assignment.Task7;

import java.util.*;

public class Question3_Task7 {
    public static boolean hasUniqueChars(String str) {
        Set<Character> charSet = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (charSet.contains(ch)) {
                return false;
            }
            charSet.add(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (hasUniqueChars(input)) {
            System.out.println("The string has all unique characters.");
        } else {
            System.out.println("The string does not have all unique characters.");
        }
    }

}

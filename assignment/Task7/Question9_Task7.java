package com.assignment.Task7;

import java.util.*;

public class Question9_Task7 {
    public static void generateCombinations(String str, String output, int index) {
        System.out.println(output);

        for (int i = index; i < str.length(); i++) {
            generateCombinations(str, output + str.charAt(i), i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("All possible combinations:");
        generateCombinations(str, "", 0);
    }

}

package com.assignment.Task7;

import java.util.*;

public class Question6_Task7 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        //Create a HashMap to store characters and their counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        //Loop through the string to count each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        System.out.println("Character occurrences:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

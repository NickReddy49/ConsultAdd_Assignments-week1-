package com.assignment.Task7;

import java.util.*;
public class Question1_Task7 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        HashSet<Character> set = new LinkedHashSet<>();
        char ch =' ';
        char previous_character = ' ';
        for(int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if(!set.contains(ch)) {
                if(previous_character != ch) {
                    set.add(ch);
                }
            } else {
                previous_character = ch;
                set.remove(ch);
            }
        }
        if(!set.isEmpty()) {
            System.out.println("The First non repeating unique character in a String is "+set.iterator().next());
        } else {
            System.out.println("There is no non repeating unique character in this String is");
        }
    }
}

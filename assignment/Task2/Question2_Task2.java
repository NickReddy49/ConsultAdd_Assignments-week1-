package com.assignment.Task2;

import java.util.*;
public class Question2_Task2 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);
        int asciiVal = (int)ch;
        if( (asciiVal>= 65 && asciiVal <= 90) || (asciiVal >= 97 && asciiVal <= 122)) {
            System.out.println("The given character ch"+" is an alphabet");
        } else {
            System.out.println("The given character ch"+" is not an alphabet");
        }
    }
}

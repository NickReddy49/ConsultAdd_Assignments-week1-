package com.assignment.Task1;

import java.util.*;

public class Question2_task1 {
    public static void main(String args[])throws Exception {
        //Using Scanner class to Read Input from the console
        Scanner sc = new Scanner(System.in);
        //Taking as input a String Value from the console
        System.out.println("Enter your name");
        String name = sc.nextLine();
        //Output the name to the console
        System.out.println("Hey,"+name+" Hope you are doing great!");
        //closing the scanner
        sc.close();
    }
}

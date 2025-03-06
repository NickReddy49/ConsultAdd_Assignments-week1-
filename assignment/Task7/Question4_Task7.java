package com.assignment.Task7;

import java.util.StringTokenizer;

import java.util.Scanner;
public class Question4_Task7 {
    public static void main(String args[])throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a String to Count the Number of words");
            String str = sc.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(str, " ,.!?");

            int wordCount = 0;
            while(tokenizer.hasMoreTokens()){
                wordCount = wordCount +1 ;
                tokenizer.nextToken();
            }
            System.out.println("Number of words in the string: " + wordCount);
        }
    }

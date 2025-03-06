package com.assignment.Task3;

import java.util.*;

public class Question10_Task3 {
    public static void main(String args[])throws Exception {
        int even = 2;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 11; j++) {
                if(j+1 < even || j+1 > 12-even ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            even =even +2 ;
        }
    }
}

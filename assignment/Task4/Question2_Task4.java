package com.assignment.Task4;

import java.util.*;

public class Question2_Task4 {
    public static void main(String args[])throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        double arr[] =new double[n];
        System.out.println("Enter the elements in the double array one by one");
        for(int i =0; i < arr.length ; i++) {
            arr[i] = sc.nextDouble();
        }
        //Calculating the average of the Double array
        double sum = 0;
        for(int i = 0; i < arr.length ; i++) {
            sum = sum + arr[i];
        }
        double avg = sum/ arr.length;
        System.out.println("The average of the array elemets is "+avg);
    }
}

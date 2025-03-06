package com.assignment.Task2;

import java.util.Scanner;

public class Question9_Task2 {
    public static void main(String args[]) throws Exception  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units to calculate the electricity bill");
        double units = sc.nextDouble();
        double price = 0.0;
        if( units <= 60 ) {
            price = price + units * 0.30;
        } else if (units > 60 && units <= 150) {
            units = units - 60;
            price = price + 60 * 0.30 + units * 0.75;
        } else if (units > 150 && units <= 270) {
             units = units - 150;
             price = price + 60 * 0.30 + 90 * 0.75 + units * 1.10;
        } else  {
            units = units - 270;
            price = price + 60 * 0.30 + 90 * 0.75 + 120 * 1.10 + units * 2.50;
        }

        //adding a Surcharge amount to the bill
        double finalprice = price + (price * 0.20);
        System.out.println("The Final Calculated bill is "+finalprice);
        }
       }

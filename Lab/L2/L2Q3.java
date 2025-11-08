/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2q3;

import java.util.Random;

/**
 *
 * @author Tay
 */
public class L2Q3 {
    public static void main(String[] args) {
         // Method 1 : Using Math Random

        System.out.println("==== Method 1 : Using Math random =====");
        int randomNum1 = (int) (Math.random() * 50) + 10;
        int randomNum2 = (int) (Math.random() * 50) + 10;
        int randomNum3 = (int) (Math.random() * 50) + 10;
        System.out.println("Random number 1 : " + randomNum1);
        System.out.println("Random number 2 : " + randomNum2);
        System.out.println("Random number 3 : " + randomNum3);

        int sum = randomNum1 + randomNum2 + randomNum3 ;
        float average = sum/3;
        System.out.printf("Sum: %d \n" , sum);
        System.out.printf("Average: %.2f \n", average);

        System.out.print("\n");

        // Method 2 : Using Random module

        System.out.println("==== Method 2 : Using random module ====");
        Random rd = new Random();

        int rd1 = rd.nextInt(41) + 10;
        int rd2 = rd.nextInt(41) + 10;
        int rd3 = rd.nextInt(41)+10;

        System.out.println("Rd 1 : " + rd1);
        System.out.println("Rd 2 : " + rd2);
        System.out.println("Rd 3: " + rd3);

        // Sum , average
        sum = rd1 + rd2 + rd3 ;
        average = sum/3;
        System.out.printf("Sum: %d \n" , sum);
        System.out.printf("Average: %.2f \n", average);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l4q8;

/**
 * L4Q8 - Prime number
 * * --------------------------------------
 * This program show Sets of Prime number within n (random generated number)
 * 
 * Key Concepts Demonstrated:
 * - Nested loop to determine whether each number is prime in n range of numbers
 *
 * @author Tay
 */

import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        // ----------------------------------------------------
        // Step 1: Generate Random Number
        // ----------------------------------------------------
        int num = rd.nextInt(101);  // 0 is inclusive, 101 is exclusive
        System.out.println("Number Generated: " + num);
        
        // ----------------------------------------------------
        // Step 2 : Handle special case of 0 and 1
        // ----------------------------------------------------
        if (num == 0 || num == 1) {
            System.out.println("Not a prime number");
        } else {

            System.out.print("First n prime number: ");
            
            boolean prime = true; // Flag to track if current number is prime
                                  // Assume i is prime unless proven otherwise
            boolean first = true; // Used to control comma placement
            
            // ----------------------------------------------------
            // Step 3 : Loop through all numbers up to "num"
            // ----------------------------------------------------
            
            for (int i = 2; i <= num ; i++) {
                
                // ----------------------------------------------------
                // Step 4: Check if 'i' is divisible by any number < i
                // ----------------------------------------------------
                for (int j = 2; j < i ; j++) {
                    if (i % j == 0 ) { // Found a divisor, not prime
                        prime = false;
                        break;
                    }
                }
                
                // ----------------------------------------------------
                // Step 5: Print if the number is prime
                // ----------------------------------------------------
                if (prime == true ) { 
                    if (!first) {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                }
                
                // Set first to be always false , Reset prime to true
                first = false;
                prime = true;
            }
        }
    }
}

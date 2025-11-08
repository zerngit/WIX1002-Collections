/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l4q6;

/**
 * L4Q6 - Random positive number generator and its number of digits
 * 
 * @author Tay
 */
import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        // -------------------------------------
        // Generate random number
        // Change to positive if the generated number is negative
        // -------------------------------------
        
        int num = rd.nextInt();
        if (num < 0) {
            num *= -1;
        }
        
        System.out.println(num);
        
        int numDigits = 0;
        
        // -------------------------------------
        // Count the digit in number
        // -------------------------------------
        
        while (num > 0) {
            numDigits += 1;
            num /= 10;
        }
        
        System.out.println(numDigits);
        
    }
}

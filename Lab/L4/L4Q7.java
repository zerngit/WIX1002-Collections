/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l4q7;

/**
 * L4Q7 - Mortgage Loan
 * --------------------------------------
 * This program display amortization table for mortgage loan.
 * 
 *  Key Concepts Demonstrated:
 * - Alignment printing specific syntax 
 * 
 * @author Tay
 */

import java.util.Scanner;

public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        double P = sc.nextDouble();
        System.out.println("Enter interest in %: ");
        double i = sc.nextDouble();
        System.out.println("Enter total number of month (s) : ");
        int N = sc.nextInt();
        double M = ((P*i/(12*100))/(1-Math.pow((1+(i/(12*100))),-N)));
        double C = 0;
        double L = 0;
        double R = 0;
        double cuL = 0;
        System.out.println();
        
        // ----------------------------------------------------
        // Display the header of the table
        // ----------------------------------------------------
        
        /* Notes  : Instead of using .repeat() , use formatting for alignment printing
           Syntax : %[flags][width][.precision]conversion
        
           Where:
           % → starts a format specifier
           flags → control alignment (- = left align)
           width → how many character spaces to reserve
           .precision → (optional) number of decimal places (for floats/doubles)
           conversion → the data type (s, d, f, etc.)
        
        */
        
        System.out.printf("%-8s%18s%15s%15s%18s%20s%n",
                "Month", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        
        // ----------------------------------------------------
        // Fill the values into table with respective fields
        // ----------------------------------------------------
        
        for (int j = 1 ; j <= N ; j++ ) {
            C = M * Math.pow((1+(i/(12*100))),-(1+N-j));
            L = M-C;
            R = (L/(i/(12*100)))-C;
            cuL += L;
            
            System.out.printf("%-8d%18.2f%15.2f%15.2f%18.2f%20.2f", j , M, C, L, R, cuL);
            System.out.println();
                    
        }
    }
}

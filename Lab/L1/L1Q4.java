/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l1q4;

/**
 *
 * @author Tay
 */


public class L1Q4 {

    public static void main(String[] args) {
        
        // Setting up ANSI colors

        String RESET = "\u001B[0m";
        String red = "\u001B[41m \u001B[0m"; // red background, reset after
        String green = "\u001B[42m \u001B[0m";
        String yellow = "\u001B[43m \u001B[0m" ;
        String blue = "\u001B[44m \u001B[0m" ;
        String purple = "\u001B[45m \u001B[0m";
        String cyan = "\u001B[46m \u001B[0m";


        // Display horizontal bar chart
        System.out.println("   Month       |        Amount");
        System.out.println("January 2016   |" + red.repeat(25) + RESET + "(2500)");
        System.out.println("February 2016  |" + yellow.repeat(16)+ RESET + "(1600)") ;
        System.out.println("March 2016     |" + green.repeat(20) + RESET + "(2000)");
        System.out.println("April 2016     |" + blue.repeat(27) + RESET + "(2700)");
        System.out.println("May 2016       |" + cyan.repeat(32)+ RESET + "(3200)");
        System.out.println("June 2016      |" + purple.repeat(8)+ RESET + "(800)");

    }
    
}

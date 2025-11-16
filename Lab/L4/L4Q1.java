/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.wix1002lab.l4q1;

/**
 *
 * @author Tay
 */
import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        System.out.print("The factors are: ");
        
        // Printing the pattern/format of (", {num}") for all element excluding first factor
        // So we will take care of first element
        
        boolean first = true;
        
        for (int i = 1 ; i <= range ; i++) {
            if (num % i == 0) {
                
                // Only first factor wont enter this selection
                
                if (!first) { 
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
    }
}

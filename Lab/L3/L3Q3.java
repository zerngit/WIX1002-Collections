/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l3q3;

/**
 *
 * @author Tay
 */

import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        int salesV = sc.nextInt();
        float com = 0;
        if (salesV > 1000) {
            com = 12.5f;
        } else if (salesV > 500) { 
            com = 10f;
        } else if (salesV > 100) {
            com = 7.5f;
        } else if (salesV > 0) {
            com = 5f;
        }
        
        double commision = com * salesV;
        System.out.printf("Total commision received : %.2f%n", commision);
        
    }
}

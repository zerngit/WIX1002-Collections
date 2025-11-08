/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l4q2;

/**
 *
 * @author Tay
 */
import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" ");
        
        System.out.print("Enter integer n: ");
        int n = sc.nextInt();
        
        // Method 1 : Recall Add Math method
        
        System.out.println("==== Method 1 ====\n");
        int sum = 0;
        for (int i = 1 ; i <= n ; i++) { 
            sum += (i * (i + 1)) / 2.0;
        }
        System.out.println("Total : " + sum );
        
        System.out.println(" ");
        
        // Method 2 : Nested for
        System.out.println("==== Method 2 ====\n");
        sum = 0;
        int temp = 0;
        for (int i = 1 ; i <= n ; i ++) { 
            for (int j = 1 ; j <= i; j++) { 
                temp = temp + j;
            } 
            System.out.println(temp);
            sum = sum + temp;
            temp = 0;
        }
        System.out.println("Total : " + sum);
    }
}

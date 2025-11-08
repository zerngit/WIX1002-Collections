/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l3q1;

/**
 *
 * @author Tay
 */

import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.print("Enter the operand: ");
        char operator = input.next().charAt(0);
        int results = 0;
        boolean valid;
        switch (operator) {
            case '+':
                results = num1 + num2;
                valid = true ;
                break;
            case '-':
                results = num1 - num2;
                valid = true ;
                break;
            case '*':
                results = num1 * num2;
                valid = true ;
                break;
            case '/':
                results = num1 / num2;
                valid = true ;
                break;
            case '%':
                results = num1 % num2;
                valid = true ;
                break;
            default:
                System.out.println("Invalid operator");
                valid = false;
        }
        if (valid) {
            System.out.printf("%d %c %d = %d", num1 , operator, num2 , results);
        }
                

       
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.l2q2;

/**
 *
 * @author Tay
 */
import java.util.Scanner;

public class L2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the price of car : RM");
        double p = input.nextDouble();
        //input.nextLine();
        System.out.print("Enter the Down payment : RM");
        //System.out.flush();
        double d = input.nextDouble();
        System.out.print("Enter the interest rate in (%) : ");
        //System.out.flush();
        float r = input.nextFloat();
        System.out.print("Enter the loan duration in year: ");
        //System.out.flush();
        float y = input.nextFloat();
        double m = (p-d) * (1+r*y /100) / (y*12);
        System.out.printf("Monthly payment: RM %.2f",m);
    }
    
}

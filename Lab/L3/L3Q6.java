/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l3q6;

/**
 *
 * @author Tay
 */

import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double radius = sc.nextDouble();
        System.out.println("Enter coordinate (x,y): ");
        String coordinate = sc.nextLine();
        
        coordinate = coordinate.replace("(","").replace(")","");
        String[] parts = coordinate.split(",");
        
        int x = Integer.parseInt(parts[0].trim());
        int y = Integer.parseInt(parts[1].trim());
        
        double dist = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        
        if (dist <= radius) {
            System.out.println("The point is inside the circle");
        } else {
            System.out.println("The point is outside the circle");
        }
        
                
    }
}

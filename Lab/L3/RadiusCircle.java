/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Tay
 */

import java.util.Scanner;

public class RadiusCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle : ");
        double radius = sc.nextDouble();
        // consume the leftover newline after nextDouble() so subsequent nextLine() reads work
        sc.nextLine();
        System.out.println("Enter coordinate (x,y): ");
        String coordinate = sc.nextLine();
        System.out.println("Enter Center Point (x,y): ");
        String centerPoint = sc.nextLine();
        
        coordinate = coordinate.replace("(","").replace(")","");
        String[] parts = coordinate.split(",");
        centerPoint = centerPoint.replace("(","").replace(")","");
        String[] centerParts = centerPoint.split(",");
        
        int x = Integer.parseInt(parts[0].trim());
        int y = Integer.parseInt(parts[1].trim());
        int centerX = Integer.parseInt(centerParts[0].trim());
        int centerY = Integer.parseInt(centerParts[1].trim());
        
        double dist = Math.sqrt(Math.pow(x - centerX,2) + Math.pow(y - centerY,2));
        
        if (dist <= radius) {
            System.out.println("The point is inside the circle");
        } else {
            System.out.println("The point is outside the circle");
        }
        
                
    }
}
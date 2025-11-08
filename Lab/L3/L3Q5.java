/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l3q5;

/**
 *
 * @author Tay
 */
import java.util.Scanner;

public class L3Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ax + by = e, cx + dy = f; x = (ed-bf)/(ad-bc) y=(af-ec)/(ad-bc)");
        System.out.println("Enter value of a, b, c, d, e, f : ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        float f = sc.nextFloat();
        float det = a*d-b*c;
        if (det == 0) {
            System.out.println("The equation has no solution");
        } else {
            float x = (e*d - b*f) /det;
            float y = (a*f - e*c) / det;
            System.out.printf("Value of x : %.2f \n",x);
            System.out.printf("Value of y : %.2f \n",y);
        }
    }
}

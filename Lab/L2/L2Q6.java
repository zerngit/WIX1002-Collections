/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2;

import java.util.Scanner;

/**
 *
 * @author Tay
 */
public class L2Q6 {
     public static void main(String[]args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in gram : ");
        double m = input.nextInt();
        m = m/1000;
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double it = input.nextDouble();
        it = (it-32)/1.8;
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double ft = input.nextDouble();
        ft = (ft-32)/1.8;
        double q = m* (ft-it) * 4184;
        System.out.printf("The energy needed is %e" , q);

    }
}

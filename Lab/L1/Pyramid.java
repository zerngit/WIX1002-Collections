/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pyramid;

/**
 *
 * @author Tay
 */

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of line: " );
        int line = input.nextInt();

        System.out.println(" ");

        for (int i = 0 ; i < line ; i++) {
            for (int j = 0 ; j < (2*(line-1)+1); j++ ) {
                //System.out.print(j);
                if ((j >= (2*(line-1)+1)/2 - i  ) && (j <= (2*(line-1)+1)/2 +i )){
                    System.out.print("*");
                    //System.out.print(j);
                } else {
                    System.out.print(" ");
                    
                }
                //System.out.print(j);
            }
            System.out.println(" ");
            
        }
    }
    
    
    
}

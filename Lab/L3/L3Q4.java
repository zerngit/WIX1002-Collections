/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l3q4;

/**
 *
 * @author Tay
 */
import java.util.Random;

public class L3Q4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int dice1 = rd.nextInt(5) + 1 + rd.nextInt(5)+1;
        int dice2 = rd.nextInt(5) + 1 + rd.nextInt(5)+1;
        System.out.printf("Player 1 dice value: %d \n",dice1);
        System.out.printf("Player 2 dice value: %d \n",dice2);
        if (dice1 > dice2) { 
            System.out.println("Player 1 Win");
            
        } else if (dice1 < dice2) {
            System.out.println("Player 2 Win");
            
        } else {
            System.out.println("It's a Tie");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l3q2;

/**
 *
 * @author Tay
 */
import java.util.Random;

public class L3Q2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(5);
        String word = "";
        switch (num) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
                          
        }
        System.out.printf(" %d is %s", num, word);
    }
}

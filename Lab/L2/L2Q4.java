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
public class L2Q4 {
    public static void main(String[]args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int sec = input.nextInt();
        int hour = sec/3600;
        int minutes = (sec - hour*3600)/60;
        int seconds = sec- (hour * 3600) - (minutes * 60);
        System.out.printf("\n   %d seconds is %d hours, %d minutes and %d seconds", sec, hour, minutes, seconds);
        
    }
}

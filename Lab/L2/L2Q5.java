/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L2;

import java.util.Random;

/**
 *
 * @author Tay
 */
public class L2Q5 {
    public static void main(String[]args) { 
        Random rd = new Random();
        int rdnum = rd.nextInt(10000);
        System.out.printf("Random number generated: %d \n ", rdnum);
        
        int temp = rdnum;
        int total = 0;
        while (temp > 0) {
            total += temp % 10;
            temp /= 10;
            System.out.println(temp);
        }
        System.out.println("Total: "+ total);

    }
}

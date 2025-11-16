/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * L4Q3 — Score Analysis
 * --------------------------------------
 * This program analyses the score on multiple aspects.
 *  
 * Key Concepts Demonstrated:
 * - Utilize ArrayList Class to store scores
 * - While loop to control input section
 * - Multiple For loops to process score
 *
 * @author Tay
 */

import java.util.Scanner;
import java.util.ArrayList;

public class L4Q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        // Use arrayList to store list value of scores
        
        ArrayList<Integer> list = new ArrayList<>();
        while (true) { 
            System.out.print("Enter a score [negative score to quit]: ");
            num = sc.nextInt();
            if (num < 0) 
                break;
            list.add(num);
        }
        
        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        int sumElementSquared = 0;
        
        for (int i = 0; i < list.size()-1 ; i++) {
            if (list.get(i+1) < list.get(i)) {
                min = list.get(i+1);
            } else if (list.get(i+1) > list.get(i)) {
                max = list.get(i+1);
            }
            
        }
        
        for (int i = 0; i< list.size(); i++) {
            sum = sum + list.get(i);
            sumElementSquared = sumElementSquared + (int) Math.pow(list.get(i),2);
        }
        
        double avg = sum / list.size();
        double std = Math.sqrt((sumElementSquared- ((Math.pow(sum,2))/list.size()))/(list.size()-1));
        
        System.out.println("Minimum Score: "+min);
        System.out.println("Maximum Score: "+ max);
        System.out.printf("Average Score: %.2f \n",avg);
        System.out.printf("Standard deviation: %.2f ", std);
    }
}

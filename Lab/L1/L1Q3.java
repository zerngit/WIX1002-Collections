/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q3;

/**
 *
 * @author Tay
 */

import java.util.Scanner;
public class L1Q3 {

    /**
     * @param args the command line arguments
     */
    
    // Domain of Rectangle : 3+n, where n = 0,1,2
    public static void Rectangle(int i,int size){
        for (int j = 0; j < size; j ++) {
            if (i == 0 || i == size-1) {
                System.out.print("*");
            } else if (j == 0 || j == size-1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    // Domain of Oval : 6+3n , where n = 0,1,2...
    public static void Oval(int i,int size) {
        for (int j = 0 ; j < size ; j++) {
            if ((i == 0 || i == size-1) && (j>= size/3 && j < size*2/3)) {
                System.out.print("*");
                //System.out.print("1");
            } else if ((i == 1 || i == size -2) && (j == 1 || j == size-2)) {
                System.out.print("*");
                //System.out.print("2");
            } else if ((i >= 2 && i <= size - 3) && (j == 0 || j == size-1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    // Domain of Arrow : 7+2n, where n = 0,1,2..
    public static void Arrow(int i, int size){
        double arrowUpperRange = size * 0.5 -1.5;
        for (int j = 0 ; j < size ; j++) {
            if (i < arrowUpperRange) {
                if (j >= (size + 1)/2 - i && j <= (size+1)/2+i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                
            
            } else if (j == size /2 +1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    // Domain of Diamond : 9+2n, where n = 0,1,2..
    public static void Diamond(int i , int size) {
        for (int j = 0 ; j < size ; j++) { 
            if ((i == 0 || i == size -1 )){
                if (j == size /2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } else if (i >= 0 && i <= size/2) {
                if ( j == size /2 - i || j == size/2 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            } else if (i >= size/2 + 1 && i <= size - 2) {
                if (j == size /2 + 1 - (size -i) || j == (size + (size-3)/2 )-i) {
                   System.out.print("*"); 
                } else { 
                    System.out.print(" ");
                }
            } else { 
                System.out.print(" ");
            }
        }
    }
    
    public static void main(String[] args) {
        

        // TODO code application logic here
        

        // Workable size domain : 9,15,21,27,33,....

        int size = 11;
        for (int i = 0 ; i< size ; i++) {
            L1Q3.Rectangle(i,size);
            System.out.print("          ");
            L1Q3.Oval(i,size);
            System.out.print("          ");
            L1Q3.Arrow(i,size);
            System.out.print("          ");
            L1Q3.Diamond(i,size);
            System.out.println();
        }
    }
}

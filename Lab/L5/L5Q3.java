/*
 * L5Q3 - Track employees' working hours over a week
 * 
 * @author Tay
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        int [][] employee = new int[n][7];
        int totalHours = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i+1) + " working hours:");
            for (int j = 0 ; j < 7 ; j++) {
                employee[i][j] = 1 + rd.nextInt(7);
                System.out.println("Day " + (j+1) + ": " + employee[i][j] + " hours");
                totalHours += employee[i][j];
            }
            System.out.println("Total hours worked: " + totalHours);
            System.out.println();
            totalHours = 0;
        }
        sc.close();
    }
}

/*
 * L5Q5 - Sort a list of 20 random numbers in descending order and search for a number using linear and binary search
 * 
 * @author : Tay
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int [] list = new int[20];
        boolean first = true;
        System.out.println("A List of 20 random numbers within 0 to 100: ");
        for (int i = 0; i < 20; i++) {
            list[i] = rd.nextInt(100);
            if (!first) {
                System.out.print(", ");
            } else {
                first = false;
            }
            System.out.print(list[i]);
        }

        
        for (int pass = 1 ; pass < list.length ; pass++) {
            for (int i = 0 ; i < list.length-1 ; i++) {
                if (list[i] < list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                }
            }
        }

        System.out.println();
        first = true;
        System.out.println("After sorting in descending order: ");
        for (int i = 0; i < 20; i++) {
            if (!first) {
                System.out.print(", ");
            } else {
                first = false;
            }
            System.out.print(list[i]);
        }

        System.out.println();
        
        System.out.print("Enter a number to search: ");
        int searchNum = sc.nextInt();
        int loopcount = 0;

        // Linear Search
        for (int cnt = 0 ; cnt < list.length ; cnt++) {
            loopcount++;
            if (list[cnt] == searchNum) {
                System.out.println(searchNum + " found");
                break;
            }
        }
        System.out.println("Linear search - " + loopcount + " loops (s)");

        // 
        loopcount = 0;
        int low = 0;
        int high = list.length-1;
        int middle;
        while (low <= high) {
            middle = (low + high) / 2;
            if (searchNum == list[middle]) {
                System.out.println(searchNum + " found");
                break;
            } else if (searchNum < list[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
            loopcount++;
        }
        System.out.println("Binary search - " + loopcount + " loops (s)");
        sc.close();
    }
}

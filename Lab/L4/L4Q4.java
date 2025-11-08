/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.wix1002lab.l4q4;
/**
 * L4Q4 — The Calendar
 * --------------------------------------
 * This program display month calendar based on the target year and the starting day on 1st of Jan of that year.
 * 
 * Key Concepts Demonstrated:
 * - Day counting algorithm
 * - Formula to determine starting day of the month
 * - Multiple for loop to print the structure and layout of the calendar

 *
 * @author Tay
 * 
 **/
import java.util.Scanner;

public class L4Q4 {
    
    /**
     * Returns the number of days in a given month for a given year.
     * Handles leap years for February.
     *
     * @param month Month number (1–12)
     * @param year  Year (e.g., 2025)
     * @return Number of days in the specified month
     */
    
    public static int getDaysPerMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                // Leap year: divisible by 400, or divisible by 4 but not 100
                return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) ? 29 : 28;
            default:
                return 0; // Invalid month
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        System.out.print("Enter the first day of the year (0=Sun, 1=Mon, ..., 6=Sat): ");
        int day = sc.nextInt();

        System.out.print("Enter the month for the calendar (1–12): ");
        int month = sc.nextInt();

        // ---------------------------------------------------------
        // Step 1: Calculate total days that have passed before this month
        // ---------------------------------------------------------
        // We sum the number of days from January up to (month - 1).
        // Example: For March, we sum days in Jan and Feb.
        // ---------------------------------------------------------
        int totalDayInMonth = 0;
        for (int i = 1; i < month; i++) {
            totalDayInMonth += getDaysPerMonth(i, year);
        }

        // ---------------------------------------------------------
        // Step 2: Determine the starting weekday of the target month
        // ---------------------------------------------------------
        // Concept:
        //   Each month’s first day shifts forward by the total number
        //   of days that have passed since January 1.
        //   Since the week repeats every 7 days, we use modulo 7.
        //
        // Example:
        //   Jan 1 = Wednesday → day = 3
        //   Days before May = 31 + 28 + 31 + 30 = 120
        //   startday = (120 + 3) % 7 = 4 → Thursday
        //
        // Note:
        //   Any total that is a multiple of 7 (7, 14, 21, …)
        //   wraps back to 0, representing Sunday.
        // ---------------------------------------------------------
        int startday = (totalDayInMonth + day) % 7;

        // ---------------------------------------------------------
        // Step 3: Print the calendar layout
        // ---------------------------------------------------------
        System.out.println();
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces before the first day
        for (int i = 0; i < startday; i++) {
            System.out.print("    "); // 4 spaces per column
        }

        // Print each day of the month
        for (int daycount = 1; daycount <= getDaysPerMonth(month, year); daycount++) {
            int spacecount = (daycount >= 10) ? 2 : 3;
            System.out.print(daycount + " ".repeat(spacecount));

            // Newline after each Saturday
            // startday is fixed, so adding with daycount gives the actual location of the day
            if ((daycount + startday) % 7 == 0) {
                System.out.println();
            }
        }
    }
}


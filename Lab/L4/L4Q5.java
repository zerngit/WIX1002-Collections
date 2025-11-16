/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * L4Q5 — Dice Game Simulation
 * --------------------------------------
 * This program simulates a simple two-player dice game.
 * 
 * Rules:
 * - Each player rolls a six-sided dice (1–6) in turns.
 * - If a player rolls a 6, they get an extra turn (bonus roll).
 * - The game continues until either player’s total score exceeds 100.
 * - After the game ends, the final scores are displayed along with the winner.
 * 
 * Key Concepts Demonstrated:
 * - Random number generation using java.util.Random
 * - Nested loops with labeled continue statements
 * - Turn-based logic using boolean control
 * - Conditional checks for determining winners
 *
 * @author Tay
 */

import java.util.Random;


public class L4Q5 {
    public static void main(String[] args) {
        Random rd = new Random();
        int total1 = 0;  // Total score for player 1
        int total2 = 0;  // Total score for player 2
        int dice;        // Stores current dice value
        boolean turn = true;  // Controls whose turn it is
        
        // ---------------------------------------------------------
        // Main Game Loop
        // ---------------------------------------------------------
        // The loop continues as long as both players’ totals are ≤ 100.
        // Once either player exceeds 100, the game ends.
        // ---------------------------------------------------------
        while (total1 <= 100 && total2 <= 100) {
            
            // -----------------------------------------------------
            // Player 1’s Turn
            // -----------------------------------------------------
            // Uses a loop label (player1) to handle bonus rolls.
            // If the dice shows 6, player 1 rolls again.
            // Otherwise, the turn passes to player 2.
            // -----------------------------------------------------
            player1:
            while (turn) {
                dice = 1 + rd.nextInt(6);   // Random value between 1 and 6
                total1 += dice;
                
                System.out.println("Player 1 rolls " + dice + " (Total: " + total1 + ")");
                
                if (dice == 6) {
                    System.out.println("Bonus roll for Player 1!");
                    continue player1;       // Continue within the same labeled loop
                } else {
                    turn = false;           // End Player 1’s turn
                }
            }
            
            // Pass turn to Player 2
            turn = true;
            
            // -----------------------------------------------------
            // Player 2’s Turn
            // -----------------------------------------------------
            // Same logic as Player 1. Rolls continue if dice = 6.
            // -----------------------------------------------------
            player2:
            while (turn) {
                dice = 1 + rd.nextInt(6);
                total2 += dice;
                
                System.out.println("Player 2 rolls " + dice + " (Total: " + total2 + ")");
                
                if (dice == 6) {
                    System.out.println("Bonus roll for Player 2!");
                    continue player2;
                } else {
                    turn = false;
                }
            }
            
            // Reset for next round
            turn = true;
        }
        
        // ---------------------------------------------------------
        // Game Result Summary
        // ---------------------------------------------------------
        System.out.println("\n---------------------------");
        System.out.println("Player   Score");
        System.out.println("  1       " + total1);
        System.out.println("  2       " + total2);
        System.out.println("---------------------------");
        
        if (total1 > total2) {
            System.out.println("Winner: Player 1");
        } else if (total2 > total1) {
            System.out.println("Winner: Player 2");
        } else {
            System.out.println("It’s a tie!");
        }
    }
}
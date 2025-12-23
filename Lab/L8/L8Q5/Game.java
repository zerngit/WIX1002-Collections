package L8.L8Q5;

import java.util.Random;

public class Game {
    private String player1;
    private String player2;
    private int score1 = 0;
    private int score2 = 0;
    private Random rd = new Random();

    public Game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;

    }

    public int rollDice() {
        return rd.nextInt(5) + 1;
    }

    public void GameStart() {
        System.out.println("-".repeat(34));
        System.out.printf("%-12s Dice Game %12s\n", "|","|");
        System.out.println("-".repeat(34));
        //System.out.println();
        System.out.printf("|Player%5s|%-10s|%-10s|\n", " ",player1, player2);
        System.out.println("-".repeat(34));
        System.out.println();
        while (score1 < 100 && score2 < 100) {
            score1 += rollDice();
            score2 += rollDice();
        }

        System.out.printf("\nPlayer %s Score: %d ", player1, score1);
        System.out.printf("\nPlayer %s Score: %d", player2, score2);
        if (score1 > score2) {
            System.out.printf("\nPlayer %s win", player1);
        } else if (score2 > score1) {
            System.out.printf("\nPlayer %s win",player2);
        } else {
            System.out.println("\nTie");
        }
        
    }

}

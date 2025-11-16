/*
 * L5Q4 - Rotate a 3x3 matrix 90 degrees clockwise
 * 
 * @author Tay
 * 
 */

import java.util.Random;

public class L5Q4 {
    public static void main(String[] args) {
        Random rd = new Random();

        int [][] matrix = new int[3][3];

        System.out.println("3x3 Matrix:");

        for (int i = 0 ; i < 3 ; i++) {
            for (int j = 0 ; j < 3 ; j++) {
                matrix[i][j] = rd.nextInt(9);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("After rotates 90 degree clockwise: ");
        for (int a = 0 ; a < 3 ; a++) {
            for (int b = 2; b >= 0 ; b--) {
                System.out.print(matrix[b][a] + " ");
            }
            System.out.println();
        }
    }
}

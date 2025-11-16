
import java.util.Random;
import java.util.Scanner;

public class RotateMatrix {
    public static void clockwiseRotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        //int[][] rotated = new int[cols][rows];

        for (int a = 0; a < cols; a++) {
            for (int b = rows - 1; b >= 0; b--) {
                //rotated[a][rows - 1 - b] = matrix[b][a];
                System.out.print(matrix[b][a] + " ");
            }
            System.out.println();  
        }

    }

    public static void antiClockwiseRotate(int[][]matrix) { 
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int a = cols-1; a >= 0 ; a --) {
            for (int b = 0 ; b < rows ; b++) {
                System.out.print(matrix[b][a] + " ");
            }
            System.out.println();
        }
        
    }

    public static void rotate180(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int a = rows -1; a >= 0 ; a--) {
            for (int b = cols -1; b >= 0 ; b--) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row of the matrix : ");
        int rows = sc.nextInt();
        System.out.print("Enter the column of the matrix : ");
        int cols = sc.nextInt();
        System.out.print("Enter the degree of rotation (+90 for clockwise, -90 for anti-clockwise): ");
        int degree = sc.nextInt();

        int [][] matrix = new int[rows][cols];

        System.out.println(rows + "x" + cols + " Matrix:");
        
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < cols ; j++) {
                matrix[i][j] = rd.nextInt(9);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println();

        if (degree > 0) {
            System.out.println("After rotates " + degree + " degree clockwise: ");
        } else {
            System.out.println("After rotates " + (-degree) + " degree anti-clockwise: ");
        }

        if (degree % 180 == 0 && degree != 0 ) {
            rotate180(matrix);

        } else if (degree % 90 == 0 && degree != 0) {
            degree = degree % 360;
            if (degree < 0) {
                antiClockwiseRotate(matrix);
            } else {
                clockwiseRotate(matrix);
            }
        }
        sc.close();
    }
}

import java.util.Random;
import java.util.Scanner;

public class RotateMatrix {

    public static void clockwiseRotate(int[][] matrix) {

        int rows = matrix[0].length;
        int cols = matrix.length;
        int [][] rotated = new int[rows][cols];

        for (int a = 0 ; a < rows ; a++) {
            for (int b = 0; b < cols; b++) {
                rotated[a][b] = matrix[cols-1-b][a];
                System.out.print(rotated[a][cols - 1 -b] + " ");
            }
            System.out.println();
        }

    } 

    public static void antiClockwiseRotate(int[][]matrix) { 

        int rows = matrix[0].length;
        int cols = matrix.length;

        int[][] rotated = new int[rows][cols];

        for (int a = 0 ; a < rows ; a++) {
            for (int b = 0 ; b < cols ; b++) {
                rotated[a][b] = matrix[b][rows-1-a];
                System.out.print(rotated[a][b] + " ");
            }
            System.out.println();
        }
    }

    public static void rotate180(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int [][] rotated = new int[rows][cols];

        for (int a = 0; a < rows ; a++) {
            for (int b = 0; b < cols ; b++) {
                rotated[a][b] = matrix[rows-1-a][cols-1-b];
                System.out.print(rotated[a][b] + " ");
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

    
        if (degree % 360 == 0) {
            System.out.println("No rotation needed.");
        } else {
            if (degree > 360 ) {
                degree = degree % 360;
            }
            
            if (degree % 270 == 0) {
                if (degree < 0) {
                    clockwiseRotate(matrix);
                } else {
                    antiClockwiseRotate(matrix);
                }
            } else if (degree % 180 == 0 ) {
                rotate180(matrix);
            } else if (degree % 90 == 0) {
                if (degree < 0) {
                    antiClockwiseRotate(matrix);
                } else {
                    clockwiseRotate(matrix);
                }
            }
        } 
        sc.close();
    }
}


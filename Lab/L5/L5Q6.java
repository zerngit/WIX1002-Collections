/*
 * L5Q6 - Generate Pascal's Triangle using Recursive Factorial Method, Iterative Factorial Method and 2D Array Method
 * 
 * Key Concepts Demonstrated 
 * 1. Methods
 * 2. Recursion
 * 3. 2D Array
 * 
 * @author Tay
 * 
 */
import java.util.Scanner;

public class L5Q6 {

    // ---------------------------------------------------------
    // Method 1 : Recursive Factorial Method
    // ---------------------------------------------------------
    public static int factorialrecursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorialrecursion(n-1);
        }
    }
    
    // ---------------------------------------------------------
    // Method 2 : Iterative Factorial Method
    // ---------------------------------------------------------
    public static int factorialiterative(int n) {
        int factorial = 1;
        if (n == 0) 
            return 1;
        for (int i = 1; i <= n; i++) {
            factorial *= (i) ;
        } 
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int rows = sc.nextInt();

        int value = 0;
        int k = rows -1 ;

        System.out.println("The Pascal Triangle with " + rows + " rows is: ");

        System.out.println();

        System.out.println("\nUsing Recursive Factorial Method:\n");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < (i+1); j++) {
                value = factorialrecursion(i) / ((factorialrecursion(j) * (factorialrecursion(i-j))));
                System.out.print(value + " ");
                
            }
            System.out.print("0 ".repeat(k));
            System.out.println();
            k--;
        }

        System.out.println("\nUsing Iterative Factorial Method:\n");
        k = rows -1 ;
        for (int i = 0 ; i < rows ; i++) {
            for (int j = 0 ; j < (i+1) ; j++) {
                value = factorialiterative(i) / ((factorialiterative(j) * (factorialiterative(i-j))));
                System.out.print(value + " ");
                
            }
            System.out.print("0 ".repeat(k));
            System.out.println();
            k--;
        }

        // ---------------------------------------------------------
        // Method 3 : 2D Array Method
        // ---------------------------------------------------------
        System.out.println("\nUsing 2D Array Method:\n");

        int [][] matrix = new int[rows][rows];
  
        for (int i = 0; i < rows; i++) {
            for (int j = 0 ; j < rows ; j++) {
                if (i == 0 && j == 0) {
                    matrix[i][j] = 1;
                }
                else if (i == 0) {
                    matrix[i][j] = 0;
                }
                else {
                    if (j == 0) {
                        matrix[i][j] = 1;
                    }
                    else {
                        matrix[i][j] = matrix[i-1][j] + matrix[i-1][j-1];
                    }
                    
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

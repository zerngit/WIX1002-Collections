import java.util.Random;
import java.util.Scanner;

public class T4Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------------------------
        // *
        // a. Find the largest integer n so that n3 is less than 2000
        // *
        // ---------------------------------

        int numCube = 0;
        int num = 1;
        while (numCube < 2000) {
            numCube = (int) Math.pow(num,3);
            System.out.println("The cube of " + num + " is: " + numCube);
            num++;
        }
       System.out.println("The smallest integer whose cube is lesser than 2000 is: " + (num - 2));

        // ---------------------------------
        // *
        // b. Display the square number of the first twelve integers starting from 1.
        // *
        // ---------------------------------


        int sum = 0;
        for (int i = 1; i <= 12 ; i++) {
            sum += Math.pow(i,2);
        }
        System.out.println("The sum of the first 12 squared positive integers is: " + sum);

        // ---------------------------------
        // *
        // c. Display a 4-by-5 matrix using random number within 0 to 100.
        // *
        // ---------------------------------

        Random rand = new Random();
        int[][] matrix = new int[5][4];
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4; i++) {
                matrix[j][i] = rand.nextInt(101) ;
                System.out.print(matrix[j][i] + " ");
            }

            System.out.println();
        }

        // ---------------------------------
        // *
        // d. Compute the sum of numbers from 1 to a given number. 
        // *
        // ---------------------------------
        System.out.print("Enter a integer: ");
        int givenNumber = sc.nextInt();
        int n;

        if (givenNumber > 0) {
            n = givenNumber;
        } else {
            n = 2-givenNumber;
        }

        int totalSum = (int) (n/2.0 * (1+givenNumber));
        System.out.println("The sum of numbers from 1 to " + givenNumber + " is: " + totalSum);
        
        // ---------------------------------
        // *
        //e. Compute the sum of the series: 1/25+2/24+3/23 … + 25/1 in two decimal places.
        // *
        // ---------------------------------

        // Version 1: Using single for loop
        System.out.println();
        System.out.println("Using single for loop:");
        for (double i = 1, j = 25, seriesSum = 0; i <= 25 && j >= 1; i++, j--) {
            seriesSum += i/j;
            if (i == 25) {
                System.out.printf("The sum of the series is: %.2f", seriesSum);
            }
        }
        
        // Version 2: Using separate variables
        System.out.println();
        System.out.println("Using separate variables:");

        double seriesSum = 0;
        double m = 25;
        for (double k = 1 ; k <=25 ; k++) {
            seriesSum += k/m;
            m--;
            if (k == 25) {
                System.out.printf("The sum of the series is: %.2f", seriesSum);
               
            }
        }
    }
}

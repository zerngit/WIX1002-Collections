import java.util.Random;
import java.util.Scanner;

/*
 * L5Q1 - Generate n random numbers and find max, min, average
 * 
 * @author Tay
 * 
 */
public class L5Q1 {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int [] list = new int[n];
        int sum = 0;

        System.out.println("List of numbers :");
        for (int i = 0; i < n; i++) {
            list[i] = rd.nextInt(100);
            System.out.println(list[i]);
            sum += list[i];
        }

        int max = list[0];
        int min = list[0];
        for (int i = 0; i < n ; i++) {
            if (list[i] > max) {
                max = list[i];
            }
            if (list[i] < min) {
                min = list[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Average: " + (double)sum/n);
        sc.close();
    } 
}         
        

package L6;

import java.util.Scanner;
import java.util.Random;

public class L6Q5 {
    public static boolean c(int num1, int num2, int num3){
        return ((num1 * num2) == num3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int count = 0;

        while (true) {
            int num1 = rd.nextInt(12);
            int num2 = rd.nextInt(12);
            System.out.println("Enter negative number to quit.");
            System.out.print(num1 + " x " + num2 + " = ");
            int num3 = sc.nextInt();
            if (num3 < 0) {
                break;
            }
            count += c(num1,num2,num3) ? 1 : 0;
        }

        System.out.println("Your Score is " + count);
    }
}

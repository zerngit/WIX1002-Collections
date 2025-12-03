package L6;

import java.util.Scanner;

public class L6Q4 {
    
    public static int e(int num1, int num2) {
        int a,b;
        int r = 1;
        a = Math.max(num1,num2);
        b = Math.min(num1,num2);
        while (r != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println();
        System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + e(num1, num2));

        System.out.println();
        System.out.println("Test Cases:");
        System.out.println(e(24, 8));
        System.out.println(e(200, 625));
    }
}

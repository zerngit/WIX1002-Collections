package L6;

import java.util.Scanner;

public class L6Q6 {

    public static boolean pr(int number) {
        for (int i = 2 ; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean pal(int number) {
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        return sb.toString().equals(sb.reverse().toString());
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static boolean pp(int number) {
        return pr(number) && pal(number);
    }

    public static boolean ermip(int number) {
        return pr(number) && !pal(number) && pr(reverse(number));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Palindromic Prime ? : " + pp(number));
        System.out.println("Emirp ? : " + ermip(number));
    }
}

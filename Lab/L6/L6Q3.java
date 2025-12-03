package L6;

import java.util.Scanner;

public class L6Q3 {

    // Method 1: Method to reverse integer as string
    public static String reverseString(int number) {
        StringBuilder sb = new StringBuilder(String.valueOf(number));
        return sb.reverse().toString();
    }

    // Method 2: Method to reverse integer mathematically
    public static int reverse(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0){
            temp /= 10;
            count++;
        }

        int reversed = 0;

        for (int i = 0; i < count ; i++) {
            reversed  += (number % 10) * (int)Math.pow(10, count -1 -i);
            number /= 10;
        }
        
        return reversed;
    
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] array = new int[10];
        int [] reversedInts = new int[10];
        String[] reversedStrings = new String[10];

        System.out.println("Enter 10 integers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
            reversedInts[i] = reverse(array[i]);
            reversedStrings[i] = reverseString(array[i]);
        }

        System.out.println();

        System.out.println("Method 1: The reversed integers as strings are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(reversedStrings[i]+ " ");
        }

        System.out.println("\n");

        System.out.println("Method 2: The reversed integers as integers are: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(reversedInts[i]+ " ");
        }
    }
}

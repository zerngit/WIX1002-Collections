package L6;

import java.util.Scanner;

public class L6Q2 {

    public static void multiPrint(int n, char c) {
        System.out.print(String.valueOf(c).repeat(n));
        return;
    }

    public static void leftTriangle(int line, char c) { 
        for (int i = 1; i <= line; i++) {
            multiPrint(i, c);
            System.out.println();
        }
        return;
    }

    public static void rightTriangle(int line, char c) {
        for (int i = 1; i <= line; i++) {
            multiPrint(line - i, ' ');
            multiPrint(i, c);
            System.out.println();
        }
        return;
    }

    public static void centeTriangle(int line, char c) {
        for (int i = 1; i <= line; i++) {
            multiPrint(line - i, ' ');
            multiPrint((2*i -1), c);
            System.out.println();
        }
    }

    public static void diamond(int line, char c) {
        for (int i = 1; i <= line; i++) {
            multiPrint(line - i, ' ');
            multiPrint((2*i -1), c);
            System.out.println();
        }
        for (int i = line - 1; i >= 1; i--) {
            multiPrint(line - i, ' ');
            multiPrint((2*i -1), c);
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of lines: ");
        int line = input.nextInt();
        System.out.print("Enter a character: ");
        char c = input.next().charAt(0);
        
        System.out.println("Left aligned triangle:");
        leftTriangle(line, c);
        System.out.println();
        System.out.println("Right aligned triangle:");
        rightTriangle(line, c);
        System.out.println();
        System.out.println("Center aligned triangle:");
        centeTriangle(line, c);
        System.out.println();
        System.out.println("Diamond shape:");
        diamond(line, c);
        System.out.println();

        input.close();
    }
}

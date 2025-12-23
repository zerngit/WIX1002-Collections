package T07;

import java.io.PrintWriter;
import java.io.FileOutputStream;        
import java.io.IOException;

import java.util.Scanner;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

import java.util.Random;

public class T7Q1 {
    public static void main(String[] args) {

        // Question a
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("T07/data/integer.txt"));
            Random rd = new Random();
            int num;
            for (int i = 0; i < 10 ; i++) {
                num = rd.nextInt(1000);
                writer.println(num);
            }
            System.out.println("Data written to 'T07/data/integer.txt'.");
            writer.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        // Question b 
        try {
            Scanner sc = new Scanner(new FileInputStream("T07/data/integer.txt"));
            int number;
            int max = 0;
            while (sc.hasNextInt()) {
                number = sc.nextInt();
                System.out.println(number);
                if (number > max) {
                    max = number;
                }
            }
            System.out.println("Max value: " + max);
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problem with file input");
        }

        // Question c
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("T07/data/integer.dat"));
            Random rd = new Random();
            int num;
            for (int i = 0; i < 10 ; i++) {
                num = rd.nextInt(1000);
                oos.writeInt(num);
            }
            System.out.println("Data written to 'T07/data/integer.dat'.");
            oos.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        // Question d
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("T07/data/integer.dat"));
            int count = 0, sum = 0, average;
            int number;
            while (true) {
                try {
                    number = ois.readInt();
                    System.out.println(number);
                    count++;
                    sum += number;
                } catch (EOFException e) {
                    System.out.println("End of file reached.");
                    break;
                }
            }
            ois.close();
            average = sum / count;
            System.out.println("Average value: " + average);
            
        } catch (IOException e) {
            System.out.println("Problem with file input");
        }
    }
}

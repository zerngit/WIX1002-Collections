package T07;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class T7Q3 {
    public static void main(String[] args) {
        try {
            PrintWriter writer = new PrintWriter(new FileOutputStream("T07/data/data.txt"));
            String sentence = "Tutorial 7 is fun";
            byte [] bytes = sentence.getBytes();
            int temp = bytes[0];
            String acc = "";
            for (int i = 0; i < bytes.length ; i++) {
                temp = bytes[i];
                while (temp > 0) {
                    acc = (temp % 2) + acc;
                    temp /= 2;
                }
                System.out.println(acc);
                writer.println(acc);
                acc = "";
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }

        try {
            Scanner sc = new Scanner(new FileInputStream("T07/data/data.txt"));
            String line;
            while (sc.hasNextLine()) {
                line = sc.nextLine();
                int value = Integer.parseInt(line,2);
                char ch = (char) value;
                System.out.print(ch);
            } /*
                int acc = 0;
                int power = 0;
                while (value > 0) {
                    acc += (value % 10) * Math.pow(2,power);
                    value /= 10;
                    power++;
                }
                char c = (char) acc;
                System.out.print(c);
            } */
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Problem with file input");
        }
    }
}

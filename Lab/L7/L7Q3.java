package L7;

import java.util.Scanner;
import java.io.FileInputStream;

import java.io.PrintWriter;
import java.io.FileOutputStream;

import java.io.FileNotFoundException;



public class L7Q3 {
    public static void main(String[] args) {

        String sourceTxtPath = "L7/Lab07/lecturer.txt";
        String destFilePath = "L7/Lab07/reversed.txt";

        try {
            Scanner inputStream = new Scanner(new FileInputStream(sourceTxtPath));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(destFilePath));
            String line;
            while (inputStream.hasNextLine()) {
                line = inputStream.nextLine();
                String reversedLine = new StringBuilder(line).reverse().toString();
                outputStream.println(reversedLine);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("Reversed lines written to " + destFilePath);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

    }
}

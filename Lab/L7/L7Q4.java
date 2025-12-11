package L7;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class L7Q4 {
    public static void main(String[] args) {

        String sourceTxtPath = "L7/Lab07/lecturer.txt";

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            Scanner inputStream = new Scanner(new FileInputStream(sourceTxtPath));
            
            System.out.println("Reading from file: " + sourceTxtPath);
            System.out.println();
            while (inputStream.hasNextLine()) {
                lineCount += 1;
                String line = inputStream.nextLine();
                charCount += line.length();
                String [] words = line.trim().split(" ");
                wordCount += words.length;
            }

            inputStream.close();
            
            System.out.println("Line count: " + lineCount);
            System.out.println("Word count: " + wordCount);
            System.out.println("Character count: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        

    }
}

package L7;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {

        String sourceTxtPath = "L7/Lab07/course.txt";
        String destFilePath = "L7/Lab07/coursename.dat";

        // Writing course data to .dat file
        try (Scanner inputStream = new Scanner(new File(sourceTxtPath));
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(destFilePath))) {

            while (inputStream.hasNextLine()) {
                String code = inputStream.nextLine().trim();
    
                String name = inputStream.nextLine().trim();

                // skip year, semester, marks (3 lines)
                for (int i = 0; i < 3; i++) {
                    if (inputStream.hasNextLine()) inputStream.nextLine();
                }

                System.out.println("Code: " + code + " | name: " + name);
                oos.writeUTF(code);
                oos.writeUTF(name);
            }

            System.out.println();
            System.out.println("Course data written to " + destFilePath);
        }
        catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Searching course data
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter course code to search: ");
        String searchCode = sc.nextLine();
        boolean found = false;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(destFilePath))) {
            while (true) {
                try {
                    String code = ois.readUTF();
                    String name = ois.readUTF();

                    if (code.equalsIgnoreCase(searchCode)) {
                        System.out.println("Course Name: " + name);
                        found = true;
                        break;
                    }
                } catch (java.io.EOFException e) {
                    break; // reached end of file
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        if (!found) {
            System.out.println("Course code not found.");
        }

        sc.close();
    }
}

package L7;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.EOFException;
import java.io.FileNotFoundException;

public class L7Q5 {
    public static void main(String[] args) {

        String srcPath = "L7/Lab07/person.dat";

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(srcPath));
            System.out.println("Reading person data from " + srcPath);
            try {
                System.out.println();
                
                int numR = ois.readInt();
                
                System.out.println("Number of records: " + numR);
                while (true) {
                    String name = ois.readUTF();
                    int age = ois.readInt();
                    char gender = ois.readChar();
                    System.out.printf("Name : %-20s | Age : %-3d | Gender : %-1c \n", name,age,gender);

                }
            } catch (EOFException e) {
                //System.out.println("End of file reached.");
            }
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}

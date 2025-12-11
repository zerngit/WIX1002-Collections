package L7;

import java.util.Scanner;
import java.io.FileInputStream;

import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class L7Q6 {
    public static void main(String[] args) {
        
        String productPath = "L7/Lab07/product.txt";
        String orderPath = "L7/Lab07/order.txt";
        String destPath = "L7/Lab07/merge.txt";

        String [] productID = new String[100];
        String [] productName = new String[100];
        int [] quantity = new int[100];
        double [] productPrice = new double[100];
        double [] totalPrice = new double[100];

        int productCount = 0;

        try {
            Scanner productStream = new Scanner(new FileInputStream(productPath));
            String line;

            while (productStream.hasNextLine()) {

                line = productStream.nextLine().trim();
                String [] productParts = line.split(",");

                productID[productCount] = productParts[0].trim();
                productName[productCount] = productParts[1].trim();
                productPrice[productCount] = Double.parseDouble(productParts[2].trim());

                productCount++;
            }

            productStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 


        String [] orderID = new String[100];
        String [] orderProductID = new String[100];
        int [] orderQuantity = new int[100];
        int orderCount = 0;

        try {
            Scanner orderStream = new Scanner(new FileInputStream(orderPath));
            String line;

            while (orderStream.hasNextLine()) {
                
                line = orderStream.nextLine().trim();
                String [] orderParts = line.split(",");

                orderID[orderCount] = orderParts[0].trim();
                orderProductID[orderCount] = orderParts[1].trim();
                orderQuantity[orderCount] = Integer.parseInt(orderParts[2].trim());

                orderCount++;

            }

            orderStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 

        try {
            PrintWriter outputStream = new PrintWriter(new FileOutputStream(destPath));
            for (int i = 0; i < productCount; i++) {
                for (int j = 0 ; j < orderCount; j++) {
                    if (productID[i].equals(orderProductID[j])) {
                        quantity[i] += orderQuantity[j];
                        totalPrice[i] = quantity[i] * productPrice[i];

                        String line = String.format("%s, %s, %d, %.2f, %.2f", productID[i], productName[i], quantity[i], productPrice[i], totalPrice[i]);
                        outputStream.println(line);

                    }
                }
            }
            outputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } 
        
        try {
            Scanner reader = new Scanner(new FileInputStream(destPath));
            System.out.println("%-10s %-20s %-10s %-10s %-10s".formatted("ProductID", "ProductName", "Quantity", "UnitPrice", "TotalPrice"));
            while (reader.hasNextLine()) {
                String recordLine = reader.nextLine().trim();
                String [] recordParts = recordLine.split(",");

                String pID = recordParts[0].trim();
                String pName = recordParts[1].trim();
                String qty = recordParts[2].trim();
                String uPrice = recordParts[3].trim();
                String tPrice = recordParts[4].trim();

                System.out.printf("%-10s %-20s %-10s %-10s %-10s%n", pID, pName, qty, uPrice, tPrice);

            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}

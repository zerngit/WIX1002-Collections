package T08.T8Q3;

import java.util.Scanner;

public class TesterQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Coordinate map = new Coordinate();
        while (true) {

            // Show current J coordinate
            System.out.println("\nJ is currently at " + map.getJCoord());

            // Ask user
            System.out.print("Do you want to change J location? (y/n): ");
            char choice = sc.next().charAt(0);

            if (choice == 'n' || choice == 'N') {
                System.out.println("Exiting program.");
                break;
            }

            // Get new coordinates
            System.out.print("Enter new X (0–9): ");
            int x = sc.nextInt();

            System.out.print("Enter new Y (0–9): ");
            int y = sc.nextInt();

            // Validation
            if (x < 0 || x > 9 || y < 0 || y > 9) {
                System.out.println("❌ Invalid coordinate. Try again.");
                continue;
            }

            // Update J location
            map.setJCoord(x, y);

            // Re-draw map
            System.out.println();
            map.InitializeMap();
        }

        sc.close();
    }
}

package T08.T8Q3;

import java.util.Random;

public class Coordinate {

    class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private Point[][] coord = new Point[10][10];
    private Random rd = new Random();
    private Point rdJ = new Point(rd.nextInt(10) , rd.nextInt(10));

    public Coordinate() {
        InitializeCoord();
        InitializeMap();
    }

    public void InitializeCoord() {
        int startX = 0, startY = 0;
        for (int i = 0; i < coord.length ; i++) {
            for (int j = 0; j < coord.length; j++) {
                coord[i][j] = new Point(startX + j, startY + i);
            }
        }
    }
    public void InitializeMap() {

        System.out.println("=== First Quadrant of Cartesian Plane ===");

        // -------- X-AXIS (TOP) --------
        System.out.print("   "); // spacing for Y-axis numbers
        for (int x = 0; x < 10; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        // -------- GRID + Y-AXIS --------
        for (int y = 9; y >= 0; y--) {   // Y from top to bottom
            System.out.print(y + "  "); // Y-axis number

            for (int x = 0; x < 10; x++) {
                if (rdJ.x == x && rdJ.y == y) {
                    System.out.print("J ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }


    public void setJCoord(int x, int y) {
        this.rdJ = new Point(x,y);
    }

    public String getJCoord() {
        return String.format("(%s,%s)",rdJ.x, rdJ.y);
    }

}

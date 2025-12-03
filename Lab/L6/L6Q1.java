package L6;

public class L6Q1 {
    public static int trianglularnumber(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++){
            System.out.println("Triangular number " + i + " is " + trianglularnumber(i));
        }
    }
}

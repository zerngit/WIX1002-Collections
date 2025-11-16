import java.util.Scanner;
public class Multiple {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();
        System.out.print("Enter the range: ");
        int range = sc.nextInt();
        System.out.print("The multiples are: ");
        boolean first = true;
        for (int i = num ; i <= (range * num) ; i++) {
            if (i % num == 0) {
                if (!first) { 
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }
    }
}

import java.util.Scanner;

public class T4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String sentence = sc.nextLine();
        String reversed = "";
        for (int i = sentence.length() -1 ; i >= 0 ; i--) {
            reversed += sentence.charAt(i);
        }
        System.out.println("Reversed String: " + reversed);
    }

}

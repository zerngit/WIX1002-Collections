/*
 * L5Q2 - Generate 10 unique random numbers between 0-19
 * 
 * @author Tay
 * 
 */
import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int [] list = new int[10];
        list[0] = rd.nextInt(20);
        int temp;

        System.out.println("List of numbers :");

        for (int i = 0 ; i < 10 ; i++) {
            temp = rd.nextInt(20);
            
            for (int j = 0 ; j < (i+1) ; j++) {
                while (temp == list[j]) {
                    temp = rd.nextInt(20);
                }
            }

            list[i] = temp;
            
            System.out.println(list[i]);
        }
        
    }
}

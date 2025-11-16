import java.util.Random;

public class T5Q6 {
    public static void main(String[] args) {

        Random rd = new Random();

        int num = rd.nextInt(255);
        System.out.println(num);
        int [] bits = new int[8];

        for (int i = 0 ; i < 8; i++) {
            bits[i] = num % 2;
            num = num/2;
        }

        for (int j = bits.length-1 ; j >= 0 ; j--) {
            System.out.print(bits[j]);
        }
    }
}

package T08.T8Q2;

public class Digit {
    private int num;

    public Digit(int num) {
        this.num = num;
    }

    public int digitMultiplication() {
        int acc = 1;
        int temp = num;
        while (temp > 1) {
            acc = acc * (temp % 10) ;
            temp /= 10;
        }

        return acc;
    }

    public void displayDigitMul() {
        System.out.printf("%3d -> %3d" , num, digitMultiplication());
    }

}

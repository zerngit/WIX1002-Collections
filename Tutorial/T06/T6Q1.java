import java.util.Random;

public class T6Q1 {

    static Random rd = new Random();

    public static int M(int a, int b , int c) {
        return Math.max(a, Math.max(b,c));
    }

    public static boolean s(int n) {
        if (n % Math.sqrt(n) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int c(int n, int k) {
        int fn = 1;
        int fk = 1;
        int fnk = 1;

        for (int i = n; i > 0 ; i--) {
            fn *= i;
        }

        for (int j = k; j > 0 ; j--) {
            fk *= j;
        }

        for (int m = n - k; m > 0 ; m--) {
            fnk *= m;
        }
        return fn / (fk * fnk);
    }

    public static boolean pn(int pn) {
        double discriminant = 1 - 4 * 3 * (-2 * pn);
        double r1 = (1 + Math.sqrt(discriminant)) / 6;
        double r2 = (1 - Math.sqrt(discriminant)) / 6;
        if (r1 == Math.floor(r1) || r2 == Math.floor(r2)) {
            return true;
        } else {
            return false;
        }

    }
    public static int[] D(String sentence) {
        int numLetters = 0;
        int numDigits = 0;

        for (int i = 0 ; i < sentence.length() ; i++ ) {
            if (sentence.charAt(i) >= '0' && sentence.charAt(i) <= '9') {
                numDigits++;
            } else if ((sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') ||
                (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z')) {
                numLetters++;
            }
        }

        int[] result = {numLetters, numDigits};

        return result;
    }

    public static void rnd() {
        //andom rd = new Random();
        System.out.println("10 random numbers between 1 and 100:");
        for (int i = 0 ; i < 10 ; i++) {
            int randomNum = rd.nextInt(100) + 1;
            System.out.println(randomNum);
        }
    }

    public static void ac(int r) {
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }


    public static int rnt() {
        boolean [] seen = new boolean[11];

        while (true) {
            int num = rd.nextInt(11);

            if (seen[num]) {
                return num;
            }
            
            seen[num] = true;
        }
    }

    public static void main(String[] args) {
        //System.out.println(pn(5));
        System.out.println(rnt());
    }
}

public class T4Q2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 10; x> 0 ; x--) {
            sum += x;
        }

        int x = 0;
        int y = 0;
        do {
            x += 2;
            y += x;
            System.out.println(x+ "and" + y);

        }
        while (x < 100);

        for (int x = 1, y = 20; x<y ; x++, y-=2) {
            System.out.println(x + "" + y);
        }

        int i = 1;
        while (i < 10) {
            i++;
        }
        System.out.println("Program End");
    }
}

package L8.L8Q7;

public class Money {

    private double amount;
    private int rm100,rm50,rm10,rm5,rm1,c50,c20,c10,c5;

    public Money(double amount) {
        int lastdigit = (int) ((amount*100) % (int) (amount*10));
        if (lastdigit <= 2) {
            this.amount = amount - (double) lastdigit/100;
        } else if (lastdigit <= 7) {
            this.amount = amount - (double) lastdigit/100 + 0.05;
        } else {
            this.amount = amount - (double) lastdigit/100 + 1;
        }


    }

    public void countNum() {
        double tempAmount = amount;
        while(tempAmount >= 0.01) {
            if (tempAmount >= 100) {
                rm100++;
                tempAmount -= 100;
            } else if (tempAmount >= 50) {
                rm50++;
                tempAmount -= 50;
            } else if (tempAmount >= 10) {
                rm10++;
                tempAmount -= 10;
            } else if (tempAmount >= 5) {
                rm5++;
                tempAmount -= 5;
            } else if (tempAmount >= 1) {
                rm1++;
                tempAmount -= 1;
            } else if (tempAmount >= 0.5) {
                c50++;
                tempAmount -= 0.5;
            } else if (tempAmount >= 0.2) {
                c20++;
                tempAmount -= 0.2;
            } else if (tempAmount >= 0.1) {
                c10++;
                tempAmount -= 0.1;
            } else if (tempAmount >= 0.05) {
                c5++;
                tempAmount -= 0.05;
            }
        }
        
        System.out.printf("Number of notes/coins for RM%.2f:\n", amount);
        System.out.printf("RM100: %d\n", rm100);
        System.out.printf("RM50: %d\n", rm50);
        System.out.printf("RM10: %d\n", rm10);
        System.out.printf("RM5: %d\n", rm5);
        System.out.printf("RM1: %d\n", rm1);
        System.out.printf("50sen: %d\n", c50);
        System.out.printf("20sen: %d\n", c20);
        System.out.printf("10sen: %d\n", c10);
        System.out.printf("5sen: %d\n", c5);
    }

    
}

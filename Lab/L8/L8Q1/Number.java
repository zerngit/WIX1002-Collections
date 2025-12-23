package L8.L8Q1;

import java.util.Random;

public class Number {

    private int total;
    private int range;

    public Number(int t, int r) {

        this.total = t;
        this.range = r;

        int [] numbers = new int[total];
        Random rand = new Random();
        System.out.print("Int Array : [");
        for (int i = 0; i < total; i++) {
            numbers[i] = rand.nextInt(range);
            System.out.print(numbers[i] + ",");
        }

        System.out.println("]");

        System.out.print("Even numbers: ");
        for (int i = 0; i < total; i++) {
            if (numbers[i] % 2 ==0) {
                System.out.print(numbers[i] + ",");
            }
        }

        System.out.println();

        System.out.print("Prime numbers: ");
        for (int i = 0; i < total; i++) {
            boolean isPrime = true;
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] < 2) {
                    isPrime = false;
                    break;
                }
                
                if (numbers[i] % j == 0) {
                    isPrime = false;
                    break;
                } 
            } 
            if (isPrime) {
                System.out.print(numbers[i] + ",");
            }
        }

        int min = numbers[0]; 
        int max = numbers[0];

        for (int i = 0 ; i < total; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            } else if (numbers[i] > max) {
                max = numbers[i];
            }
        } 

        System.out.println();
        System.out.println("Min: " + min);
        //System.out.println();
        System.out.println("Max: "+ max);
        int sum = 0;

        for (int i = 0; i < total ; i ++) {
            sum += numbers[i];
        }
        System.out.println("Average: " + (double)sum / total);

        System.out.print("Squared numbers: ");
        for (int i = 0; i < total ; i++) {
            System.out.print(Math.pow(numbers[i],2) + ",");
        }

        System.out.println();
        System.out.println();
    }

    public Number() {
        //this.total = 10;
        //this.range = 100;
        this(10,100);
    }

    public Number(int t) {
        this(t,100);
    }
}

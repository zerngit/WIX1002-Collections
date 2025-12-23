package L8.L8Q3;

import java.util.Scanner;

public class WeightCalculator {
    private int age;
    private double height;

    public WeightCalculator() {

    }

    public void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
        System.out.print("Enter height (in cm): ");
        this.height = sc.nextDouble();
    }

    public void CalculateWeight() {
        double recWeight = (height - 100 + age / 10) * 0.9;
        System.out.printf("Recommende weight is : %.2f kg\n ", recWeight);
    }
}

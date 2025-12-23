package L8.L8Q4;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denominator; 
    private Scanner sc = new Scanner(System.in);
    
    public Fraction() {
        
    }

    public void getInput() {    
        System.out.print("Numerator: ");
        numerator = sc.nextInt();
        System.out.print("Denominator: ");
        denominator = sc.nextInt();
        setVar(numerator,denominator);
    }
    public int getNumerator() {
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setVar(int nm, int dm) {
        this.numerator = nm;
        this.denominator = dm;

    }

    public String simplify() {
        if (numerator == denominator) {return String.format("%d",(int) numerator);}

        int min = (int) Math.min(numerator,denominator);
        int max = (int) Math.max(numerator,denominator);
        int simmax = 1, simmin = 1;
        for (int i = min; i > 0 ; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                simmin = min / i;
                simmax = max / i;
                break;
            }
        }

        if (numerator > denominator) {
            if (simmin == 1) {
                return String.format("%d", simmax);
            }
            return String.format("%d / %d",simmax,simmin);
        }
        else 
            return String.format("%d / %d", simmin, simmax);
    }

}
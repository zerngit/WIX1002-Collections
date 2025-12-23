package L8.L8Q4;

public class TesterQ4 { 
    public static void main(String[] args) {
        Fraction fr = new Fraction();
        fr.getInput();
        System.out.println();
        System.out.println("GetNumerator: " + fr.getNumerator());
        System.out.println("GetDenominator: " + fr.getDenominator());
        System.out.println("Fraction simplified: " + fr.simplify());
    }
}

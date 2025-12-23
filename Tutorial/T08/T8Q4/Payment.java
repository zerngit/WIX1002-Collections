package T08.T8Q4;

import java.util.Scanner;

public class Payment {
    private Scanner sc = new Scanner(System.in);
    private double amount;
    private String chequeNum;
    private String cardHolder;
    private String expirationDate;
    private String validationCode;

    public Payment() {

    }

    public void pay(double amount) {
        this.amount = amount;
        System.out.println("Payment method: Cash");
        System.out.println("Paid amount: " + this.amount);
    }

    public void pay(double amount, String chequeNum) {
        this.amount = amount;
        this.chequeNum = chequeNum;

        System.out.println("Payment method: Cheque");
        System.out.println("Cheque Number: " + this.chequeNum);
        System.out.println("Paid amount: " + this.amount);
    }

    public void pay(double amount, String cardHolder, String expirationDate, String validationCode) {
        this.amount = amount;
        this.cardHolder = cardHolder;
        this.expirationDate = expirationDate;
        this.validationCode = validationCode;

        System.out.println("Payment method: Credit Card");
        System.out.println("Card Holder: " + this.cardHolder);
        System.out.println("Expiration Date: " + this.expirationDate);
        System.out.println("Validation Code: " + this.validationCode);
        
    }

}

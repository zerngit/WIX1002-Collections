package T08.T8Q4;

public class TesterQ4 {
    public static void main(String[] args) {
        Payment payment = new Payment();

        // Cash payment
        payment.pay(100.0);

        System.out.println();

        // Cheque payment
        payment.pay(250.0, "CHQ123456");

        System.out.println();

        // Credit Card payment
        payment.pay(500.0, "John Doe", "12/25", "123");
    }
}   

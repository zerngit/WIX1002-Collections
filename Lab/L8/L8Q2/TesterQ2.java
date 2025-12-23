package L8.L8Q2;

public class TesterQ2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Tan", "060609-07-6699", 5000.00);
        account.deposit(1000);
        account.withdraw(100);
    }
}

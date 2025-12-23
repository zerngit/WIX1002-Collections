package L8.L8Q2;

public class BankAccount {
    private String name;
    private String icPass;
    private double deposit;

    public BankAccount(String name, String icPass, double deposit) {
        this.name = name;
        this.icPass = icPass;
        this.deposit = deposit;
        System.out.println("Account created for " + name);
        System.out.println("IC/Passport: " + icPass);
        System.out.println("Initial Balance: " + deposit);
        System.out.println();

    }

    public void deposit(double amount) {
        this.deposit += amount;
        System.out.println("=== Deposit ===");
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + deposit);
        System.out.println();
    }

    public void withdraw(double amount) {
        this.deposit -= amount;
        System.out.println("=== Withdrawal ===");
        System.out.println("Withdrawn: " + amount);
        System.out.println("Balance: " + deposit);
        System.out.println();
    }

}
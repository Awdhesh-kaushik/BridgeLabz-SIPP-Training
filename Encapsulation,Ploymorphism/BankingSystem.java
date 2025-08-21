abstract class BankAccount {
    private String accountNumber, holderName;
    private double balance;

    public BankAccount(String acc, String name, double bal) {
        this.accountNumber = acc;
        this.holderName = name;
        this.balance = bal;
    }

    public abstract double calculateInterest();
    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { balance -= amt; }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() { return 0.04 * 10000; }
    public void applyForLoan(double amount) {}
    public boolean calculateLoanEligibility() { return true; }
}

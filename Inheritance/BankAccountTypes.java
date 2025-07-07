package Inheritance;

// Main class to test different bank account types
public class BankAccountTypes {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 15000.50, 3.5);
        CheckingAccount ca = new CheckingAccount("CA123", 5000.00, 2000.00);
        FixedDepositAccount fda = new FixedDepositAccount("FD123", 100000.00, 6.5, 12);

        System.out.println("\n--- Savings Account Info ---");
        sa.showInfo();

        System.out.println("\n--- Checking Account Info ---");
        ca.showInfo();

        System.out.println("\n--- Fixed Deposit Account Info ---");
        fda.showInfo();
    }
}

// Base class for all account types
class BankAccount {
    private String accountNumber;
    private double balance;  // Changed to double for calculations

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Common method to display account info
    public void showInfo() {
        System.out.println("=========== Account Details ===========");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass for Savings Account
class SavingsAccount extends BankAccount {
    double interestRate;  // In percentage

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass for Checking Account
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

// Subclass for Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    double interestRate;
    int maturityPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, double interestRate, int maturityPeriod) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
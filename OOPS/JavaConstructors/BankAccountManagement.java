package JavaConstructors;

// Base class: BankAccount
class BankAccount {

    // Public variable: accessible from anywhere
    public long accountNumber;

    // Protected variable: accessible in the same package or subclasses
    protected String accountHolder;

    // Private variable: accessible only within this class
    private double balance;

    // Constructor to initialize account number and holder
    public BankAccount(long accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    // Public method to set (modify) balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Public method to get (access) balance
    public double getBalance() {
        return this.balance;
    }

    // Display bank account information
    public void displayAccountInfo() {
        System.out.println("Bank Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
        System.out.println("------------------------------");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

    // Additional property for savings account
    private double interestRate;

    // Constructor
    public SavingsAccount(long accountNumber, String accountHolder, double interestRate) {
        super(accountNumber, accountHolder); // Call parent class constructor
        this.interestRate = interestRate;
    }

    // Display savings account details
    public void displaySavingsAccountInfo() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber);     // Access public variable
        System.out.println("Account Holder: " + accountHolder);     // Access protected variable
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Balance: ₹" + getBalance());            // Access private via public method
        System.out.println("------------------------------");
    }
}

// Main class to test everything
public class BankAccountManagement {

    public static void main(String[] args) {

        // Creating a BankAccount object
        BankAccount account = new BankAccount(1234567890L, "Crime Master Gogo");
        account.setBalance(50000.0);
        account.displayAccountInfo();

        // Creating a SavingsAccount object
        SavingsAccount savings = new SavingsAccount(9876543210L, "Vasooli Bhai", 4.5);
        savings.setBalance(75000.0); // Using inherited public method
        savings.displaySavingsAccountInfo();
    }
}

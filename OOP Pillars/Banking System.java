package OOPPillars;

// Loanable Interface
interface Loanable {
    void applyForLoan();
    boolean calculateLoanEligibility();
}

// Abstract BankAccount Class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Concrete deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Concrete withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();

    // Show account details
    public void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Current Balance: ₹" + balance);
    }

    // Getters and setters (encapsulation)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

// Savings Account - with 4% interest
class SavingsAccount extends BankAccount implements Loanable {

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    public void applyForLoan() {
        System.out.println("Loan applied for Savings Account.");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;
    }
}

// Current Account - with 2% interest
class CurrentAccount extends BankAccount implements Loanable {

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    public void applyForLoan() {
        System.out.println("Loan applied for Current Account.");
    }

    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[2];
        accounts[0] = new SavingsAccount("SB1001", "Virat Kohli", 18000);
        accounts[1] = new CurrentAccount("CA2001", "Novak Djokovic", 15000);

        for (BankAccount account : accounts) {
            account.showDetails();
            account.deposit(1000);
            account.withdraw(500);
            System.out.println("Interest Earned: ₹" + account.calculateInterest());

            // Polymorphic use of Loanable
            if (account instanceof Loanable) {
                Loanable loan = (Loanable) account;
                loan.applyForLoan();
                System.out.println("Loan Eligibility: " + (loan.calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
            }

            System.out.println("--------------------------------------------");
        }
    }
}
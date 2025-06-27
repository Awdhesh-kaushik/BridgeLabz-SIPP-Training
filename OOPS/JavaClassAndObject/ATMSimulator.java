package JavaClassAndObject;

// BankAccount class simulates an ATM system
class BankAccount {
    String accountHolder;   // Account holder's name
    String accountNumber;   // Unique account number
    double balance;         // Current balance

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    // Method to withdraw money if sufficient balance exists
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display account balance
    void display() {
        System.out.println("Account Holder: " + accountHolder +
                ", Account Number: " + accountNumber +
                ", Balance: ₹" + balance);
    }
}

public class ATMSimulator {
    public static void main(String[] args) {
        // Creating and initializing BankAccount object
        BankAccount account = new BankAccount();
        account.accountHolder = "Abhishek Sharma";
        account.accountNumber = "SBI121212";
        account.balance = 5000;

        // Performing transactions
        account.deposit(4000);     // Deposit money
        account.withdraw(2000);    // Withdraw money
        account.withdraw(6000);    // Attempt to withdraw more than balance
        account.display();         // Display final account state
    }
}

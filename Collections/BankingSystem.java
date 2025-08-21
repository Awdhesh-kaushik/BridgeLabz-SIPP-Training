import java.util.*;

class BankingSystem {
    private Map<Integer, Double> accounts = new HashMap<>();
    private Queue<Integer> withdrawalQueue = new LinkedList<>();

    // Add account
    public void addAccount(int accNo, double balance) {
        accounts.put(accNo, balance);
    }

    // Request withdrawal
    public void requestWithdrawal(int accNo) {
        if (accounts.containsKey(accNo)) {
            withdrawalQueue.add(accNo);
        } else {
            System.out.println("Account not found.");
        }
    }

    // Process withdrawals
    public void processWithdrawals(double amount) {
        while (!withdrawalQueue.isEmpty()) {
            int accNo = withdrawalQueue.poll();
            double balance = accounts.get(accNo);
            if (balance >= amount) {
                accounts.put(accNo, balance - amount);
                System.out.println("Withdrawal of " + amount + " from " + accNo + " successful.");
            } else {
                System.out.println("Insufficient balance in account " + accNo);
            }
        }
    }

    // Show accounts sorted by balance
    public void showSortedAccounts() {
        TreeMap<Double, Integer> sorted = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accounts.entrySet()) {
            sorted.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Accounts sorted by balance: " + sorted);
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();
        bank.addAccount(101, 5000);
        bank.addAccount(102, 2000);
        bank.addAccount(103, 8000);

        bank.requestWithdrawal(101);
        bank.requestWithdrawal(102);

        bank.processWithdrawals(1000);
        bank.showSortedAccounts();
    }
}

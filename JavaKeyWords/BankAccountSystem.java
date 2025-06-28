package JavaKeyWords;

public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Kenichi Mitsuba","0005-123-1234567");
        BankAccount account2 = new BankAccount("Shishimaru","0005-123-5647837");
        BankAccount account3 = new BankAccount("Yumico Kawai","0005-123-5678945");
        if(account1 instanceof BankAccount){
            account1.BankAccountInfo();
        }
        if(account2 instanceof BankAccount){
            account2.BankAccountInfo();
        }
        if(account3 instanceof BankAccount) {
            account3.BankAccountInfo();
        }
        // Show total accounts created
        BankAccount.getAccountNumber();
    }
}
class BankAccount {
    protected String accountHolderName;
    final String accountNumber;
    static String bankName = "State Bank Of India";
    static int totalAccounts = 0;

    //Constructor for initialising objects
    public BankAccount(String accountHolderName,String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    //Method for getting total accounts in Bank
    public static void getAccountNumber() {
        System.out.println("Total Accounts in "+BankAccount.bankName+" is : "+BankAccount.totalAccounts);
    }

    //Showing Details of Bank Account
    public void BankAccountInfo() {
        System.out.println("Bank Account details are :");
        System.out.println("Account Holder Name : "+this.accountHolderName);
        System.out.println("Bank Name : "+BankAccount.bankName);
        System.out.println("Account Number : "+this.accountNumber);
        System.out.println("------------------------------------------------");
    }
}

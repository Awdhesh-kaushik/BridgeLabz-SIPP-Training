package ObjectModeling;
import java.util.ArrayList;
import java.util.List;

public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank sbi = new Bank("State Bank of India");
        Bank icici = new Bank("ICICI Bank");

        Customer customer1 = new Customer("Mukesh Ambani");
        Customer customer2 = new Customer("Gautam Adani");

        sbi.openAccount(customer1, sbi,5000.0);
        sbi.openAccount(customer1, sbi,10000.0);
        icici.openAccount(customer2,icici, 7500.0);

        customer1.CheckBalance();
        customer2.CheckBalance();
    }
}
//Bank Class
class Bank{
    private String name;  //Stores the name of Bank
    private List<Account> accounts;  // Stores the list of All bank account opened in that Bank
    private static int AcocountCounter = 1000;

    //Constructor for initializing the object
    public Bank(String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    //Method for opening the account
    public void openAccount(Customer customer,Bank bank,double initialBalance){
        String AccountNo = Bank.generateAccountNumber();
        Account newAccount = new Account(customer,this,initialBalance,AccountNo);
        accounts.add(newAccount);
        customer.addAccount(newAccount);
        System.out.println("Account opened Successfully for "+customer.getName()+" in Bank "+this.getName()+" with Account No: "+AccountNo);
    }

    //Generate Account number like AC1001,AC1000
    public static String generateAccountNumber(){
        return "AC"+AcocountCounter++;
    }

    //For getting name of Bank
    public String getName(){
        return this.name;
    }

}
//Customer class
class Customer{
    private String name;  //Stores the name of customer
    private List<Account> accountList; //Stores the multiple account of customer

    //Constructor for initialising objects
    public Customer(String name){
        this.name = name;
        this.accountList = new ArrayList<>();
    }

    //To add account of Customer
    public void addAccount(Account account){
        this.accountList.add(account);
    }

    //To print the Bank Balance in all account
    void CheckBalance(){
        System.out.println("Balance details of "+this.name);
        for(Account account : this.accountList){
            System.out.println("Bank Name : "+account.getBank().getName()+", Balance: ₹"+account.getBalance());
        }
    }
    public String getName(){
        return this.name;
    }
}
class Account{
    private Customer customer;
    private Bank bank;
    private double balance;
    private String accountNo;

    //Constructor for initializing object
    public Account(Customer customer, Bank bank, double balance, String accountNo){
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
        this.accountNo = accountNo;
    }
    public Customer getCustomer(){
        return this.customer;
    }
    //For getting the Bank name Whose this account is
    public Bank getBank(){
        return this.bank;
    }
    //For getting the balance of this account
    public double getBalance(){
        return this.balance;
    }

    //For getting Account Number
    public String getAccountNo(){
        return this.accountNo;
    }

}
package opps.encapsulation;

public class BankAccount {
    /*
    Question:
    Create a BankAccount class with private fields:
    accountHolder
    balance

    Create:
    - Setter methods
    - Getter methods
    - deposit(amount)
    - withdraw(amount)

    In main():
    Create an account.
    Deposit money.
    Withdraw money.
    Print final balance.
*/
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name){
        this.accountHolder = name;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void checkBalance(){
        System.out.printf("Account Holder: %s\n",getAccountHolder());
        System.out.printf("Balance: $%.2f\n",getBalance());
    }

    public static void main(String[] args) {

        //object creation
        BankAccount user1 = new BankAccount();

        //Create an account
        user1.setAccountHolder("Raushan Gupta");
        // set balance
        user1.setBalance(100);

        // money deposit
        user1.deposit(25000);
        user1.deposit(850.50);

        //money withdrawal
        user1.withdraw(5000);


        //check balance
        user1.checkBalance();

    }
}

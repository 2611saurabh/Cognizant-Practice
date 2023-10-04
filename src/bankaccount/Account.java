package bankaccount;

public class Account {

    public int accountID;
    public String accountType;
    public int balance;

    // constructors
    // public Account(int accountID, String accountType, int balance) {
    // this.accountID = accountID;
    // this.accountType = accountType;
    // this.balance = balance;
    // }

    public boolean withdraw(int money) {

        // int total_left = balance - money;

        if (balance >= money) {

            balance -= money;
            System.out.println("Balance amount will be" + balance);

            return true;
        } else {
            System.out.println("Sorry!!! No enough balance");
            return false;
        }

    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}

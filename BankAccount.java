public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    public BankAccount(int ID, String pass){
        password = pass;
        accountID = ID;
        balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setPass(String newPass) {
        newPass = password;
    }

    public boolean deposit(double amount){
        if(amount >=0) {
        balance+=amount;
        return true;
        }
        else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if(amount <= balance && amount >= 0) {
            balance-=amount;
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return String.valueOf(accountID) + "\t" + String.valueOf(balance);
    }



}

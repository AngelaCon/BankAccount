public class BankAccount {
    private double balance;
    private int accountID;
    private String password;

    public BankAccount(int ID, String pass){
        this.password = pass;
        this.accountID = ID;
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setPassword(String newPass) {
        password = newPass;
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
        return "#" + String.valueOf(accountID) + "\t$" + String.valueOf(balance);
    }

    private boolean authenticate(String password) {
        return password.equals(this.password);
    }

    public boolean transferTo(BankAccount other, double amount, String password) {
        return withdraw(amount) && other.deposit(amount) && authenticate(password);
    }


}

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

}

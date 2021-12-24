package Banking;

public class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    // overload deposit method so this method return true value if the deposit is successful
    public boolean deposit(double amount, boolean status) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    // overload withraw method to test that the amount is not greater than the balance.
    // if amount is less than the balance, then subtract the amount from the balance and return true
    // if amount is greater than the balance, then return false
    public boolean withdraw(double amount, boolean status) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

}

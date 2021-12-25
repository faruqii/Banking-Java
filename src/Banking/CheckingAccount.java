package Banking;

public class CheckingAccount extends Account {
    double overdraftProtection;

    public CheckingAccount(double balance, double overdraftProtection) {
        super(balance);
        this.overdraftProtection = overdraftProtection;
    }

    // Overload constructor public with parameters balance
    // this constructor skip the balance parameter on another constructor with call this
    public CheckingAccount(double overdraftProtection) {
        this(0, overdraftProtection);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        if (balance < 0) {
            balance -= overdraftProtection;
        } else {
            balance -= amount;
        }
    }

    
    
    
}

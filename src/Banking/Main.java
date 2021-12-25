package Banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account(199990);  
        Customer customer1 = new Customer("John", "Smith");
        customer1.setAccount(account1);

        Account account2 = new SavingsAccount(100000, 10);
        Customer customer2 = new Customer("Jane", "Doe");
        customer2.setAccount(account2);

        Account account3 = new CheckingAccount(200000, 100);
        Customer customer3 = new Customer("James", "Wick");
        customer3.setAccount(account3);

        account3.withdraw(100);
        
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        bank.getCustomer(0).getAccount().deposit(100);
        
        
    }
    
}

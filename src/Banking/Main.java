package Banking;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer customer1 = new Customer("John", "Smith");
        Customer customer2 = new Customer("Jane", "Doe");
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        System.out.println("Number of customers: " + bank.getNumberOfCustomers());
        System.out.println("Customer 1: " + bank.getCustomer(0).getFirstName() + " " + bank.getCustomer(0).getLastName());
        System.out.println("Customer 2: " + bank.getCustomer(1).getFirstName() + " " + bank.getCustomer(1).getLastName());
        // Customer Account
        Account account1 = new Account(100);
        Account account2 = new Account(200);
        customer1.setAccount(account1);
        customer2.setAccount(account2);
        System.out.println("Customer 1 account balance: " + customer1.getAccount().getBalance());
        System.out.println("Customer 2 account balance: " + customer2.getAccount().getBalance());
        // Savings Account
        SavingsAccount savingsAccount1 = new SavingsAccount(100, 0.1);
        SavingsAccount savingsAccount2 = new SavingsAccount(200, 0.2);
        customer1.setAccount(savingsAccount1);
        customer2.setAccount(savingsAccount2);
        System.out.println("Customer 1 account balance: " + customer1.getAccount().getBalance());
        System.out.println("Customer 2 account balance: " + customer2.getAccount().getBalance());
        // Checking Account
        CheckingAccount checkingAccount1 = new CheckingAccount(100, 0.1);
        CheckingAccount checkingAccount2 = new CheckingAccount(200, 0.2);
        customer1.setAccount(checkingAccount1);
        customer2.setAccount(checkingAccount2);
        System.out.println("Customer 1 account balance: " + customer1.getAccount().getBalance());
        System.out.println("Customer 2 account balance: " + customer2.getAccount().getBalance());
        // print list of customers
        System.out.println("List of customers: ");
        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println(bank.getCustomer(i).getFirstName() + " " + bank.getCustomer(i).getLastName());
        }
        // print type of customer account
        System.out.println("Type of customer account: ");
        for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
            System.out.println(bank.getCustomer(i).getAccount().getClass().getName());
        }
        
    }
    
}

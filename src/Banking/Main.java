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

        account1.deposit(50000);
        account2.withdraw(400);
        account3.withdraw(100);

        
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        System.out.println("Customer of Bank");
        System.out.println("First Customer: " + customer1.getFirstName() + " " + customer1.getLastName() + " "
                            + "with remaining balance Rp." +account1.getBalance());
        System.out.println("Second Customer: " + customer2.getFirstName() + " " + customer2.getLastName() + " "
                            + "with remaining balance Rp." +account2.getBalance());
        System.out.println("Third Customer: " + customer3.getFirstName() + " " + customer3.getLastName() + " "
                            + "with remaining balance Rp." +account3.getBalance());
        System.out.println("Total Customer: " +bank.getNumberOfCustomers());

        System.out.println("\nType of Account");
        System.out.println("Default Account : " + customer1.getFirstName() + " " + customer1.getLastName() );
        System.out.println("Savings Account : " + customer2.getFirstName() + " " + customer2.getLastName());
        System.out.println("Checking Account: " + customer3.getFirstName() + " " + customer3.getLastName());
    }

}

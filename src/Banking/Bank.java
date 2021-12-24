package Banking;

import java.util.ArrayList;

public class Bank {
    // Bank class serves Customer class
    // Bank class has a list of customers
    // Bank class has a list of accounts
    ArrayList<Customer> customers = new ArrayList<Customer>();
    ArrayList<Integer> numberOfCustomers = new ArrayList<Integer>();

    public Bank() {
        customers = new ArrayList<Customer>(5);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        numberOfCustomers.add(customers.size());
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers.size();
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    
}

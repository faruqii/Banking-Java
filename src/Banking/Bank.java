package Banking;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Bank class serves Customer class
    // Bank class has a list of customers
    private List<Customer> customers = new ArrayList<Customer>();


    public Bank() {
        customers = new ArrayList<Customer>(5);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public int getNumberOfCustomers() {
        return customers.size();
    }

    public Customer getCustomer(int index) {
        return customers.get(index);
    }

    public void getAllCustomer(){
        for (Customer customer : customers) {
            System.out.println(customer.getFirstName() + " " + customer.getLastName());
        }
    }

    
}

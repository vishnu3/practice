package cache;

import pojo.Customer;

import java.util.HashMap;

public class CustomerCache {
    private HashMap<String, Customer> customerData = new HashMap<>();


    public HashMap<String, Customer> getCustomerData() {
        return customerData;
    }
}

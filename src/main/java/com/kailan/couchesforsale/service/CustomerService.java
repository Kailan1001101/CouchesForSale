package com.kailan.couchesforsale.service;

import com.kailan.couchesforsale.entity.Customer;
import com.kailan.couchesforsale.repo.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    /**
     * Retrieves all customers from the repository.
     * @return a list of all customers.
     */
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
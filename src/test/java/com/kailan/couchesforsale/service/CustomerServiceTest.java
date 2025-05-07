package com.kailan.couchesforsale.service;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

import com.kailan.couchesforsale.entity.Customer;
import com.kailan.couchesforsale.repo.CustomerRepository;
import com.kailan.couchesforsale.service.CustomerService;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock
    private CustomerRepository customerRepository;

    @InjectMocks
    private CustomerService customerService;

    @Test
    void testGetAllCustomers() {
        // Arrange
        Customer customer1 = new Customer(1L, "Alice", "alice@example.com");
        Customer customer2 = new Customer(2L, "Bob", "bob@example.com");
        when(customerRepository.findAll()).thenReturn(Arrays.asList(customer1, customer2));

        // Act
        List<Customer> customers = customerService.getAllCustomers();

        // Assert
        assertThat(customers).hasSize(2);
        assertThat(customers).containsExactly(customer1, customer2);
    }
}
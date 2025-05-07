package com.kailan.couchesforsale.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kailan.couchesforsale.entity.Customer;
import com.kailan.couchesforsale.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.web.servlet.MockMvc;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
class CustomerControllerTest {

    @Autowired
    private MockMvc mockMvc;


    private CustomerService customerService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testGetCustomers() throws Exception {
        // Arrange
        Customer customer1 = new Customer(1L, "Alice", "alice@example.com");
        Customer customer2 = new Customer(2L, "Bob", "bob@example.com");
        when(customerService.getAllCustomers()).thenReturn(Arrays.asList(customer1, customer2));

        // Act & Assert
        mockMvc.perform(get("/api/v1/software-engineers"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(2))
                .andExpect(jsonPath("$[0].name").value("Alice"))
                .andExpect(jsonPath("$[1].email").value("bob@example.com"));
    }
}

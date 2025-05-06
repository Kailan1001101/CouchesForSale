package com.kailan.couchesforsale.repo;

import com.kailan.couchesforsale.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}

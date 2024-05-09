package com.turkcell.turkcellcrm.searchService.dataAccess;

import com.turkcell.turkcellcrm.searchService.entities.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface SearchRepository extends MongoRepository<Customer,String> {
    Optional<Customer> findCustomersByCustomerId(int customerId);
    void deleteCustomersByCustomerId(int customerId);
}

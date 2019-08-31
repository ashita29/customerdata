package com.garg.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.garg.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}

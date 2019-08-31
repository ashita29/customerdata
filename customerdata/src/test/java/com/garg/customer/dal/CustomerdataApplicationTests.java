package com.garg.customer.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.garg.customer.dal.entities.Customer;
import com.garg.customer.dal.repos.CustomerRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
public class CustomerdataApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Test	
	public void createCustomer()
	{
		Customer customer = new Customer();
		customer.setCustomerName("Rucha");
		customer.setCustomerEmail("rucha.kadam@gmail.com");
		customerRepository.save(customer);		
	}
	
	@Test
	public void readCustomer() throws Exception
	{
		Optional<Customer> customerOptional = customerRepository.findById(2l);
		if(customerOptional.isPresent())
		{
			Customer customer = customerOptional.get();
			System.out.println(customer);
		}
		else
		{
			System.out.println("Customer record is not present");
		}
	}
	
	@Test
	public void updateCustomer() throws Exception
	{
		Optional<Customer> customerOptional = customerRepository.findById(2l);
		if(customerOptional.isPresent())
		{
			Customer customer = customerOptional.get();
			customer.setCustomerName("Payal");
			customer.setCustomerEmail("payal.rathod@syr.edu");
			customerRepository.save(customer);
		
		}
		else
		{
			System.out.println("Customer record is not updated");
		}
	}
	
	@Test
	public void deleteStudent()
	{
		Customer customer = new Customer();
		customer.setId(1l);
		customerRepository.delete(customer);		
	}
	
}

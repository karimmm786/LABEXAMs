package com.klef.jfsd.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.repository.CustomerRespostiory;

@Service
public class CustomerServiceImpl implements CustomerService {

	
	@Autowired
	public CustomerRespostiory repostiory;
	@Override
	public String addCustomer(Customer customer) {
		repostiory.save(customer);
		return "Customer Added Successfully";
	}

	@Override
	public String updateCustomer(Customer customer) {
	    Optional<Customer> obj = repostiory.findById(customer.getId());
	    if (obj.isPresent()) {
	        Customer c = obj.get();
	        c.setAddress(customer.getAddress());
	        c.setName(customer.getName());
	        repostiory.save(c); 
	        return "Customer Updated Successfully";
	    } else {
	        return "Customer ID not Founf";
	    }
	}

}

package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class Controller {

	@Autowired
	public CustomerService service;
	
	
	 @PostMapping("add")
	  public String addCustomer(@RequestBody Customer customer)
	  {
	    
	    return service.addCustomer(customer);
	  }
	 
	 @PutMapping("update")
	 public String updatecustomer(@RequestBody Customer customer)
	 {
		 return service.updateCustomer(customer);
	 }
	
}

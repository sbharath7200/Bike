package com.example.demo.customercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.CustomerDetails;

@RestController
@RequestMapping("/customer")
public class Controller {
	@Autowired
	Customerservice cusservice;
	
	@PostMapping("")
	public String create(@RequestBody CustomerDetails customer )
	{
		return cusservice.addCustomer(customer);
	}
	@GetMapping("")
	public List<customer> read()
	{
		return cusservice.getCustomer();
	}
	@GetMapping("/{id}")
	public Optional<CustomerDetails>readById(@PathVariable int id)
	{
		return cusservice.getCustomerById(id);
	}
	
	
	

}

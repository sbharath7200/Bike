package com.example.demo.CustomerService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.customer.CustomerDetails;
import com.example.demo.customerRespositor.CustomerRepo;


@Service
public class CustomerService {
	@Autowired
	CustomerRepo repository;
	public String addCustomer(CustomerDetails customer)
	{
		repository.save(customer);
		return "Added";
	}
	public List<CustomerDetails>getCustrmer()
	{
		return repository.findAll();
	}
	public Oplional<CustomerDetails>getCustomerById(int id)
	{
		return repository.findById(id);
	}

}

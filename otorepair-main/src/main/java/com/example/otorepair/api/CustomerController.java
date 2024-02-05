package com.example.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.otorepair.business.services.CustomerService;
import com.example.otorepair.core.result.Result;
import com.example.otorepair.dtos.CustomerAddDto;
import com.example.otorepair.entity.Customer;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	private CustomerService customerService;
	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService=customerService;		
	}
	@PostMapping("/addCustomer")
	@GetMapping
	public Result<Customer> addCustomerApi(@RequestBody Customer customer){
		return this.customerService.addCustomer(customer);
	}
	public Result<Customer> updateResult(@RequestBody CustomerAddDto customerAddDto){
		return this.customerService.updateCustomer(customerAddDto);
	}
}

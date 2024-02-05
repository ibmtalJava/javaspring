package com.example.otorepair.business.services;

import com.example.otorepair.core.result.Result;
import com.example.otorepair.dtos.CustomerAddDto;
import com.example.otorepair.entity.Customer;

public interface CustomerService {
	Result<Customer> addCustomer(Customer customer);
	Result<Customer> updateCustomer(CustomerAddDto customerAddDto);
}

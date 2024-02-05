package com.example.otorepair.business.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.otorepair.business.services.CustomerService;
import com.example.otorepair.core.result.Result;
import com.example.otorepair.database.CustomerDao;
import com.example.otorepair.dtos.CustomerAddDto;
import com.example.otorepair.entity.Customer;

@Service
public class CustomerManager implements CustomerService{
	private CustomerDao customerDao;
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	@Override
	public Result<Customer> addCustomer(Customer customer) {
		Result<Customer> result=new Result<>();
		if(customer.getName().isEmpty()) {
			result.newError("name", "Boş Geçilemez.");
		}
		if(customer.getName().length()>30) {
			result.newError("name", "30 karakterden fazla olamaz.");
		}
		if(result.isSuccess()) {
			this.customerDao.save(customer);
			result.getData().add(customer);
		}
		return result;
	}
	@Override
	public Result<Customer> updateCustomer(CustomerAddDto customerAddDto) {
		Result<Customer> result=new Result<>();
		Customer customer=new Customer();
		if(this.customerDao.findById(customerAddDto.getId()).isEmpty()) {
			result.newError("id", "id numarasına ait müşteri Bulunamadı.");
		}
			if(result.isSuccess()==true) {
				customer=this.customerDao.findById(customerAddDto.getId()).get();
				customer.setName(customerAddDto.getName());
				customer.setSurname(customerAddDto.getSurname());
				customer.setPhone(customerAddDto.getPhone());
				this.customerDao.save(customer);
				result.getData().add(customer);
			}
		
		return result;
	}
	
}

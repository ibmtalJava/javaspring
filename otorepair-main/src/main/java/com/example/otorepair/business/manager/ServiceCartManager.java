package com.example.otorepair.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.otorepair.business.services.ServiceCartService;
import com.example.otorepair.core.result.Result;
import com.example.otorepair.database.CarDao;
import com.example.otorepair.database.ServiceCartDao;
import com.example.otorepair.dtos.ServiceCartAddDto;
import com.example.otorepair.entity.ServiceCart;

@Service
public class ServiceCartManager implements ServiceCartService{
	private ServiceCartDao serviceCartDao;
	private CarDao carDao;
	@Autowired
	public ServiceCartManager(ServiceCartDao serviceCartDao, CarDao carDao) {
		super();
		this.serviceCartDao = serviceCartDao;
		this.carDao = carDao;
	}
	@Override
	public Result<ServiceCart> addServiceCart(ServiceCart serviceCart) {
		Result<ServiceCart> result=new Result<>();
		result.setData(new ArrayList<ServiceCart>(this.serviceCartDao.findAll()));
		return result;
	}
	@Override
	public Result<ServiceCart> updateServiceCart(ServiceCartAddDto serviceCartAddDto) {
		Result<ServiceCart> result=new Result<>();
		if(this.carDao.findById(serviceCartAddDto.getCar()).isEmpty()) {
			result.newError("Car", "Araba Kaydı Bulunamadı.");
		}
		if(serviceCartAddDto.getServiceDate().isBlank())
			result.newError("ServiceDate", "Servis tarihi boş geçilemez.");
		if(result.isSuccess()) {
			ServiceCart serviceCart=new ServiceCart();
			serviceCart.setServicedate(serviceCartAddDto.getServiceDate());
			serviceCart.setPrice(serviceCartAddDto.getPrice());
			serviceCart.setCar(this.carDao.findById(serviceCartAddDto.getCar()).get());
			this.serviceCartDao.save(serviceCart);
			result.getData().add(serviceCart);
		}
		return result;
	}
}

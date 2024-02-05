package com.example.otorepair.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.otorepair.business.services.ServicePartService;
import com.example.otorepair.core.result.Result;
import com.example.otorepair.database.ServiceCartDao;
import com.example.otorepair.database.ServicePartDao;
import com.example.otorepair.dtos.ServicePartAddDto;
import com.example.otorepair.entity.ServicePart;
@Service
public class ServicePartManager implements ServicePartService{
	private ServicePartDao servicePartDao;
	private ServiceCartDao serviceCartDao;
	@Autowired
	public ServicePartManager(ServicePartDao servicePartDao, ServiceCartDao serviceCartDao) {
		super();
		this.servicePartDao = servicePartDao;
		this.serviceCartDao = serviceCartDao;
	}
	@Override
	public Result<ServicePart> addServicePart(ServicePart servicePart) {
		Result<ServicePart> result=new Result<>();
		result.setData(new ArrayList<ServicePart>(this.servicePartDao.findAll()));
		return result;
	}
	@Override
	public Result<ServicePart> updateServicePart(ServicePartAddDto servicePartAddDto) {
		Result<ServicePart>result=new Result<>();
		if(this.serviceCartDao.findById(servicePartAddDto.getServiceCart()).isEmpty()) {
			result.newError("ServiceCart", "Servis kartı bulunamadı.");
		}
		if(servicePartAddDto.getOtoPartName().isBlank()) {
			result.newError("OtoPartName", "Parça kaydı bulunamadı.");
		}
		if(result.isSuccess()) {
			ServicePart servicePart = new ServicePart();
			servicePart.setOtoPartName(servicePartAddDto.getOtoPartName());
			servicePart.setQuantity(servicePartAddDto.getQuantity());
			servicePart.setPrice(servicePartAddDto.getPrice());
			servicePart.setServiceCart(this.serviceCartDao.findById(servicePartAddDto.getServiceCart()).get());
			this.servicePartDao.save(servicePart);
			result.getData().add(servicePart);
		}
		return result;
	}
	
}

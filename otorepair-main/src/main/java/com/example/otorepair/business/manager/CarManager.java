package com.example.otorepair.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.otorepair.business.services.CarService;
import com.example.otorepair.core.result.Result;
import com.example.otorepair.database.CarDao;
import com.example.otorepair.database.CustomerDao;
import com.example.otorepair.dtos.CarAddDto;
import com.example.otorepair.entity.Car;

@Service
public class CarManager implements CarService{
	private CarDao carDao;
	private CustomerDao customerDao;
	@Autowired
	public CarManager(CarDao carDao,CustomerDao customerDao) {
		this.carDao=carDao;
		this.customerDao=customerDao;
	}
	@Override
	public Result<Car> addCar(Car car) {
		Result<Car> result=new Result<>();
		result.setData(new ArrayList<Car>(this.carDao.findAll()));		
		return result;
	}

	@Override
	public Result<Car> updateCar(CarAddDto addDto) {
		Result<Car> result=new Result<>();
		if(this.customerDao.findById(addDto.getCustomer()).isEmpty()) {
		result.newError("Customer", "Müşteri Kaydı Bulunamadı.");
		}
		if(addDto.getBrand().isBlank()) {
			result.newError("brand", "Marka Adı Boş Geçilemez.");
		}
		if(result.isSuccess()) {
			Car car= new Car();
			car.setPlaka(addDto.getPalaka());
			car.setBrand(addDto.getBrand());
			car.setModel(addDto.getModel());
			car.setColor(addDto.getColor());
			car.setCustomer(this.customerDao.findById(addDto.getCustomer()).get());
			this.carDao.save(car);
			result.getData().add(car);
		}
		return result;
	}
	
}

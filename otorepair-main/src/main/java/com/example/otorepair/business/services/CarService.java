package com.example.otorepair.business.services;

import com.example.otorepair.core.result.Result;
import com.example.otorepair.dtos.CarAddDto;
import com.example.otorepair.entity.Car;

public interface CarService {
	Result<Car> addCar(Car car);
	Result<Car> updateCar(CarAddDto addDto);
}

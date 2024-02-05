package com.example.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.otorepair.business.services.CarService;
import com.example.otorepair.core.result.Result;
import com.example.otorepair.dtos.CarAddDto;
import com.example.otorepair.entity.Car;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	private CarService carService;
	@Autowired
	public CarController(CarService carService) {
		super();
		this.carService = carService;
	}
	@PostMapping("/addCarWidthDto")
	@GetMapping
	public Result<Car> addWithDto(@RequestBody CarAddDto carAddDto){
		return this.carService.updateCar(carAddDto);
	}
}

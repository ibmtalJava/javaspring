package com.example.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.otorepair.business.services.ServiceCartService;
import com.example.otorepair.core.result.Result;
import com.example.otorepair.dtos.ServiceCartAddDto;
import com.example.otorepair.entity.ServiceCart;

@RestController
@RequestMapping("/api/servicecarts")
public class ServiceCartController {
	private ServiceCartService serviceCartService;
	@Autowired
	public ServiceCartController(ServiceCartService serviceCartService) {
		super();
		this.serviceCartService = serviceCartService;
	}
	@PostMapping("/addServiceCartWidthDto")
	@GetMapping
	public Result<ServiceCart> addWithDto(@RequestBody ServiceCartAddDto serviceCartAddDto){
		return this.serviceCartService.updateServiceCart(serviceCartAddDto);
	}
}

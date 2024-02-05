package com.example.otorepair.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.otorepair.business.services.ServicePartService;
import com.example.otorepair.core.result.Result;
import com.example.otorepair.dtos.ServicePartAddDto;
import com.example.otorepair.entity.ServicePart;

@RestController
@RequestMapping("/api/serviceparts")
public class ServicePartController {
	private ServicePartService servicePartService;
	@Autowired
	public ServicePartController(ServicePartService servicePartService) {
		super();
		this.servicePartService = servicePartService;
	}
	@PostMapping("/addServicePartWithDto")
	@GetMapping
	public Result<ServicePart> addWithDto(@RequestBody ServicePartAddDto servicePartAddDto){
		return this.servicePartService.updateServicePart(servicePartAddDto);
	}
}

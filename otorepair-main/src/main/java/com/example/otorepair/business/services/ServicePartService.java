package com.example.otorepair.business.services;

import com.example.otorepair.core.result.Result;
import com.example.otorepair.dtos.ServicePartAddDto;
import com.example.otorepair.entity.ServicePart;

public interface ServicePartService {
	Result<ServicePart> addServicePart(ServicePart servicePart);
	Result<ServicePart> updateServicePart(ServicePartAddDto servicePartAddDto);
}

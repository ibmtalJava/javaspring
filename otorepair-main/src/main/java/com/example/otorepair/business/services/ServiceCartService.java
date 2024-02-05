package com.example.otorepair.business.services;

import com.example.otorepair.core.result.Result;
import com.example.otorepair.dtos.ServiceCartAddDto;
import com.example.otorepair.entity.ServiceCart;

public interface ServiceCartService {
	Result<ServiceCart> addServiceCart(ServiceCart serviceCart);
	Result<ServiceCart> updateServiceCart(ServiceCartAddDto serviceCartAddDto);
}

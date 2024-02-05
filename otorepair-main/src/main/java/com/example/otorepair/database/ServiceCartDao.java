package com.example.otorepair.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.otorepair.entity.ServiceCart;

public interface ServiceCartDao extends JpaRepository<ServiceCart, Integer>{
	
}

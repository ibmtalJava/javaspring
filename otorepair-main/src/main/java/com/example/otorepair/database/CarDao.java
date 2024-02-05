package com.example.otorepair.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.otorepair.entity.Car;

public interface CarDao extends JpaRepository<Car, Integer>{
	
}

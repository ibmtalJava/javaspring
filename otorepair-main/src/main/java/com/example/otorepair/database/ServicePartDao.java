package com.example.otorepair.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.otorepair.entity.ServicePart;

public interface ServicePartDao extends JpaRepository<ServicePart, Integer>{

}

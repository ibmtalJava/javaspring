package com.example.otorepair.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.otorepair.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer >{

}

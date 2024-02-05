package com.example.otorepair.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="servicecarts")
public class ServiceCart {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="servicedate")
	private String servicedate;
	@ManyToOne()
	@JoinColumn(name="car")
	private Car car;
	@Column(name="price")
	private double price;
	public ServiceCart() {
		super();
	}
	public ServiceCart(int id, String servicedate, Car car, double price) {
		super();
		this.id = id;
		this.servicedate = servicedate;
		this.car = car;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServicedate() {
		return servicedate;
	}
	public void setServicedate(String servicedate) {
		this.servicedate = servicedate;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

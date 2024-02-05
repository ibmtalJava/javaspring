package com.example.otorepair.dtos;

public class ServiceCartAddDto {
	private int id;
	private String serviceDate;
	private int car;
	private double price;
	public ServiceCartAddDto() {
		super();
	}
	public ServiceCartAddDto(int id, String serviceDate,int car, double price) {
		super();
		this.id = id;
		this.serviceDate = serviceDate;
		this.car = car;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(String serviceDate) {
		this.serviceDate = serviceDate;
	}
	public int getCar() {
		return car;
	}
	public void setCar(int car) {
		this.car = car;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}

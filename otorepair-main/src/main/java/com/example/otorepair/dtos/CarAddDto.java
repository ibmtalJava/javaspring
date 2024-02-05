package com.example.otorepair.dtos;

public class CarAddDto {
	private int id;
	private String palaka;
	private String brand;
	private String model;
	private String color;
	private int customer;
	public CarAddDto() {
		super();
	}
	public CarAddDto(int id, String palaka, String brand, String model, String color, int customer) {
		super();
		this.id = id;
		this.palaka = palaka;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPalaka() {
		return palaka;
	}
	public void setPalaka(String palaka) {
		this.palaka = palaka;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCustomer() {
		return customer;
	}
	public void setCustomer(int customer) {
		this.customer = customer;
	}
}

package com.example.otorepair.dtos;

public class ServicePartAddDto {
	private int id;
	private int serviceCart;
	private String otoPartName;
	private double quantity;
	private double price;
	public ServicePartAddDto() {
		super();
	}
	public ServicePartAddDto(int id, int serviceCart, String otoPartName, double quantity, double price) {
		super();
		this.id = id;
		this.serviceCart = serviceCart;
		this.otoPartName = otoPartName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getServiceCart() {
		return serviceCart;
	}
	public void setServiceCart(int serviceCart) {
		this.serviceCart = serviceCart;
	}
	public String getOtoPartName() {
		return otoPartName;
	}
	public void setOtoPartName(String otoPartName) {
		this.otoPartName = otoPartName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
